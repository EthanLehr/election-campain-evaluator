import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CampainParser {

    public static List<Record> readRecords(String pathToCsv) throws IOException {
        List<Record> records = new ArrayList<>();
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
        String row;
        row = csvReader.readLine(); //to skip the header line
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            records.add(new Record(Integer.parseInt(data[0]), data[1]));
        }
        csvReader.close();
        return records;
    }


}
