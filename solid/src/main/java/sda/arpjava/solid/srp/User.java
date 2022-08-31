package sda.arpjava.solid.srp;

import sda.arpjava.solid.dip.Printer;
import sda.arpjava.solid.formatter.NameFormatter;

import java.util.function.Function;

public class User {
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;

    private final Function<String, String> nameFormatter;

    //Ten konstruktor powoduje silne związanie klasy User z NameFormatter
    public User(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        //lepiej przekazać przez konstruktor
        nameFormatter = NameFormatter::formatAsSelfName;
    }
    //ten konstruktor uwalnia klasę od NameFormatter
    public User(String firstName, String lastName, String password, String email, Function<String, String> nameFormatter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.nameFormatter = nameFormatter;
    }

    public String getFirstName() {
        return nameFormatter.apply(firstName);
    }

    public String getLastName() {
        return nameFormatter.apply(lastName);
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    //narusza zasady SRP, zajmuje się szczegółami budowy email'a
    public String emailDomain(){
        return email.split("@")[1];
    }

    public void printUserReport(Printer printer){
        printer.configure(300);
        printer.print(firstName + lastName + "\\n");
    }
}