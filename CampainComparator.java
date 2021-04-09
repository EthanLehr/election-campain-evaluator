import java.util.Collections;
import java.util.List;

public class CampainComparator {
    private List<Campain> campainList;

    public CampainComparator(List<Campain> campainList){
        this.campainList = campainList;
    }

    public List<Campain> sortByEvaluation(){
        Collections.sort(this.campainList);
        return this.campainList;
    }
}
