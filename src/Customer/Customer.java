package Customer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Customer {
    public Customer(){
       // checkIfActiveMember(date);
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

    /*public boolean checkIfActiveMember(String date) {
          LocalDate dateFromString = LocalDate.parse(date, formatter);
        if (dateFromString.isBefore(LocalDate.now().minusYears(1))) {
            activeMember = false;
        }
        return false;
    }*/
    @Override
    public String toString(){
        return name + "\nPersonnummer " + secNumber + "\nÅrsavgift betalades " + date;
    }
}