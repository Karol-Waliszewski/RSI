package pl.edu.pwr.rsi.grpc.service;

import com.google.protobuf.ByteString;
import pl.edu.pwr.rsi.grpc.interfaces.lib.*;

import io.grpc.stub.StreamObserver;

import net.devh.boot.grpc.server.service.GrpcService;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    private static final Path SERVER_BASE_PATH = Paths.get(".");
    Ranking ranking;

    public MyServiceImpl(){
        ranking = new Ranking();

        // Initial values
        ranking.addResult(new Result("Karol", 440));
        ranking.addResult(new Result("Marek", 333));
        ranking.addResult(new Result("Adam", 555));
    }

    public void showRanking(EmptyRequest request, StreamObserver<RankingValue> responseObserver){
        List<Result> results = ranking.getResults();
        for (Result result : results) {
            RankingValue reply = RankingValue.newBuilder().setName(result.getName()).setScore(result.getScore()).build();
            responseObserver.onNext(reply);
        }

        responseObserver.onCompleted();
    }

    public StreamObserver<RankingValue> addToRanking(StreamObserver<MessageResponse> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(RankingValue result) {
                ranking.addResult(new Result(result.getName(), result.getScore()));
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onNext(MessageResponse.newBuilder()
                        .setMessage("Wystapil blad...")
                        .build());
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(MessageResponse.newBuilder()
                        .setMessage("Dodano wartości do rankingu")
                        .build());
                responseObserver.onCompleted();
            }
        };
    }

    private OutputStream getFilePath(FileUploadRequest request) throws IOException {
        var fileName = request.getMetadata().getName() + "." + request.getMetadata().getType();
        return Files.newOutputStream(SERVER_BASE_PATH.resolve(fileName), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    private void writeFile(OutputStream writer, ByteString content) throws IOException {
        writer.write(content.toByteArray());
        writer.flush();
    }

    private void closeFile(OutputStream writer){
        try {
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public StreamObserver<FileUploadRequest> sendImage(StreamObserver<MessageResponse> responseObserver) {
        return new StreamObserver<>() {
            OutputStream writer;

            @Override
            public void onNext(FileUploadRequest fileUploadRequest) {
                try{
                    if(fileUploadRequest.hasMetadata()){
                        writer = getFilePath(fileUploadRequest);
                    }else{
                        writeFile(writer, fileUploadRequest.getFile().getData());
                    }
                }catch (IOException e){
                    System.out.println(e.getMessage());
                    this.onError(e);
                }
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onNext(MessageResponse.newBuilder()
                        .setMessage("Wystapil blad...")
                        .build());
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                try {
                    closeFile(writer);
                    responseObserver.onNext(MessageResponse.newBuilder()
                            .setMessage("Wyslano zdjecie")
                            .build());
                } finally {
                    responseObserver.onCompleted();
                }

            }
        };
    }

    public void findInRanking(Score request, StreamObserver<RankingValue> responseObserver) {
        List<Result> results = ranking.getResults();
        Result result = results.stream()
                .min(Comparator.comparingInt(res -> Math.abs(res.getScore() - request.getScore())))
                .orElseThrow(() -> new NoSuchElementException("No value present"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        RankingValue reply = RankingValue.newBuilder().setName(result.getName()).setScore(result.getScore()).build();
        responseObserver.onNext(reply);

        responseObserver.onCompleted();
    }
}
