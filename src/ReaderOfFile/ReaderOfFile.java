package ReaderOfFile;

import Customer.Customer;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
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
        File file = new File("src/ReaderOfFile/customers.txt");
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
                        membersList.add(new Customer(memberInfo1.replaceAll(",", ""), memberInfo2.trim(), date));
                    }
                }
            }
        } catch (NoSuchElementException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String searchMember(String searchValue) {
        String memberFound = "";
        try {
            for (Customer member : membersList) {
                if (member.getName().replaceAll("\\s", "").equalsIgnoreCase(searchValue) || member.getSecNumber().replaceAll("\\s", "").equalsIgnoreCase(searchValue)) {
                    memberFound = member.getName() + "\nPersonnummer " + member.getSecNumber() + "\nÅrsavgift betalades " + member.getDate() + "\nBehörig medlem: " + member.getActiveMemberShip();
                    JOptionPane.showMessageDialog(null, memberFound);
                    return memberFound;
                }
            }
            throw new IllegalArgumentException("Invalid member");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "finns ingen sådan medlem, försök igen!");
        }
        return memberFound;
    }
}


