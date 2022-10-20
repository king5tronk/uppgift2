package Customer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Customer {
    public Customer(){
    }
    private String name;
    private String secNumber;
    private String date = "";
    private boolean activeMember = true;

    public Customer(String secNumber, String name, String date) {
        this.secNumber = secNumber;
        this.name = name;
        this.date = date;

        if (LocalDate.parse(date).isBefore(LocalDate.now().minusYears(1))){
            activeMember = false;
        }
    }
    public boolean isActiveMember() {
        return activeMember;
    }
    public String getDate() {

        return date;
    }
    public String getSecNumber() {
        return secNumber;
    }
    public String getName() {
        return name;
    }
    public String getActiveMemberShip(){
        if (activeMember){
            return "ja";
        } else{
            return "nej";
        }
    }
}