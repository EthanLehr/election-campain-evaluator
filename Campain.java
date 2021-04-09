import java.io.IOException;
import java.util.List;

public class Campain implements Comparable<Campain>{
    private String sourcePath;
    private String name;
    private int cost;
    private int eval;
    private List<Record> records;

    public Campain(String sourcePath, String name, int cost) throws IOException {
        this.sourcePath = sourcePath;
        this.name = name;
        this.cost = cost;
        this.records = CampainParser.readRecords(sourcePath);
    }

    public List<Record> getRecords() {
        return records;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getEval() {
        CampainEvaluator campainEvaluator = new CampainEvaluator(this);
        this.eval = campainEvaluator.evaluate();
        return eval;
    }

    @Override
    public int compareTo(Campain c) {
        if (this.eval > c.getEval()){
            return 1;
        }
        else if (this.eval < c.getEval()){
            return -1;
        }
        return 0;

    }
}
