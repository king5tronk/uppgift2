package Program;
import ReaderOfFile.ReaderOfFile;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HeadProgram {

    public HeadProgram() throws FileNotFoundException {
        userInput();
    }

    public void userInput() throws FileNotFoundException {
        boolean repeat = true;
        do {
            String s = JOptionPane.showInputDialog("Skriv in för och efternamn på medlem eller personnummer!");
            s = s.replaceAll("\\s", "");
            ReaderOfFile e = new ReaderOfFile();
            e.searchMember(s);
        } while(repeat);

    }

    public static void main(String[] args) throws IOException {
        HeadProgram s = new HeadProgram();
        ReaderOfFile e = new ReaderOfFile();




    }
}