public class Record {

    private int id;
    private String vote;

    public Record(int id, String vote){
        this.id = id;
        this.vote = vote;
    }

    public int getId() {
        return id;
    }

    public String getVote() {
        return vote;
    }
}
