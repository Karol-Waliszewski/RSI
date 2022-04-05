package pl.edu.pwr.rsi.grpc.service;

import java.util.ArrayList;
import java.util.List;

public class Ranking {
    private final List<Result> results;

    public Ranking() {
        this.results = new ArrayList<Result>();
    }

    public void addResult(Result result){
        this.results.add(result);
        this.results.sort(Result::compareTo);
    }

    public List<Result> getResults(){
        return results;
    }
}
