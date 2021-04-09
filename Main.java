import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException {
        Campain FBcampain = new Campain("FB.csv", "FB", 500);
        Campain phoneCampain = new Campain("phone.csv", "Phone", 400);
        List<Campain> campainList = new ArrayList<>();
        campainList.add(FBcampain);
        campainList.add(phoneCampain);
        CampainComparator campainComparator = new CampainComparator(campainList);
        List<Campain> sortedCampain = campainComparator.sortByEvaluation();
        for (Campain c: sortedCampain){
            System.out.println("campain name: " + c.getName() + "\t and the eval is: " + String.valueOf(c.getEval()));
        }
    }

}
