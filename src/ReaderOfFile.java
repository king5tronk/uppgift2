import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReaderOfFile {


    public List<String> read (Path p) {

        ArrayList<String> listOfCustomers = new ArrayList<>();
        String temp;

        try(BufferedReader buf = Files.newBufferedReader(p)){
            while((temp = buf.readLine()) != null){
                listOfCustomers.add((temp));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return listOfCustomers;
    }
}
