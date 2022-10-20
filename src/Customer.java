import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Customer {
    public Customer(){
        checkIfActiveMember();
    }
    private String name;
    private String secNumber;
    private String date = "";
    private boolean activeMember = true;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");





    public Customer(String secNumber, String name, String date) {
        this.secNumber = secNumber;
        this.name = name;
        this.date = date;

    }

    public String getDate() {
        return date;
    }

    public String getSecNumber() {
        return secNumber;
    }

    /*public LocalDate getDate() {
        return date;
    }*/

    public String getName() {
        return name;
    }

    public void checkIfActiveMember() {
          LocalDate dateFromString = LocalDate.parse(date, formatter);
        if (dateFromString.isBefore(LocalDate.now().minusYears(1))) {
            activeMember = false;
        }
    }
}