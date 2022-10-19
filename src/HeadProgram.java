import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class HeadProgram {

    public HeadProgram(){


    }
    /*public String userInput(){
       String s = JOptionPane.showInputDialog("Skriv in namnet på en medlem");
        s = s.trim();
        s = s.toLowerCase();

    }*/
    public List<String> customerSearch (List<String> e){
        String s = JOptionPane.showInputDialog("Skriv in namnet på en medlem");
        s = s.trim();
        s = s.toLowerCase();
        int customerIndexInList = 0;
        for (int i = 0; i < e.toArray().length; i++){

        }
    }

    public static void main(String[] args) throws IOException {
        ReaderOfFile r = new ReaderOfFile();
        HeadProgram s = new HeadProgram();
        Path p = Paths.get("src/customers.txt");
        System.out.println(r.read(p));

    }
}