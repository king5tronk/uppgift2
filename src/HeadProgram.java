import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class HeadProgram {

    public HeadProgram() throws FileNotFoundException {
        userInput();


    }

    public String userInput() throws FileNotFoundException {
       String s = JOptionPane.showInputDialog("Skriv in namnet på en medlem");
        ReaderOfFile e = new ReaderOfFile();
        e.searchMember(s);
        return s;
    }
    /*public List<String> customerSearch (List<String> e){
        String s = JOptionPane.showInputDialog("Skriv in namnet på en medlem");
        s = s.trim();
        s = s.toLowerCase();
        int customerIndexInList = 0;
        for (int i = 0; i < e.size(); i++){
            if (s.contains()


        }
    }*/

    public static void main(String[] args) throws IOException {
        HeadProgram s = new HeadProgram();
        ReaderOfFile e = new ReaderOfFile();




    }
}