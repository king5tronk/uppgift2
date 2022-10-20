import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

public class ReaderOfFile {
    private String input;

    public String getInput() {
        return input;
    }

    public ReaderOfFile() throws FileNotFoundException {
        initiateMembersList();

    }


    private ArrayList<Customer> membersList;


    private void initiateMembersList() throws FileNotFoundException {
        int memberCount = 0;
        String date = "";
        String memberInfo1 = "";
        String memberInfo2 = "";
        membersList = new ArrayList<>();
        File file = new File("src/customers.txt");
        try (Scanner scanner = new Scanner(file);) {
            while ((scanner.hasNextLine())) {
                switch (memberCount) {
                    case 0: {
                        for (int i = 0; i < 1; i++) {
                            memberInfo1 = scanner.next();
                            memberInfo2 = scanner.nextLine();
                            date = scanner.next();
                        }
                    }
                    case 1: {
                        membersList.add(new Customer(memberInfo1.replaceAll(",", ""), memberInfo2, date));
                    }
                }

            }
        } catch (NoSuchElementException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Customer searchMember(String searchValue) {
        for (Customer member : membersList) {
            if (member.getName().equalsIgnoreCase(searchValue) || member.getSecNumber().equalsIgnoreCase(searchValue)) {
                System.out.println("äntligen!");
            }
            return member;

        }
        throw new IllegalArgumentException("Invalid member");
    }
}


