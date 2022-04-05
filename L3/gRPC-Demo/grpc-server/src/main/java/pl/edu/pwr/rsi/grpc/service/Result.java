package pl.edu.pwr.rsi.grpc.service;

public class Result implements Comparable<Result>{
    String name;
    int score;

    public Result(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return '[' + name + ", " + score + ']';
    }

    @Override
    public int compareTo(Result o) {
        return o.getScore() - this.getScore();
    }
}
