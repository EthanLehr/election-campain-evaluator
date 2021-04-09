import java.util.List;

public class CampainEvaluator {
    private List<Record> records;

    public CampainEvaluator(Campain campain){
        this.records = campain.getRecords();
    }

    public int evaluate(){
        int value = 0;
        for(Record r: records){
             String vote = r.getVote();
             if (vote.equals("ok")){
                 value += 1;
             }
            switch (vote) {
                case "ok" -> value += 1;
                case "good" -> value += 2;
                case "bad" -> value -= 1;
            }
        }
        return value;
    }

}
