package sda.arpjava.solid.ocp;

import sda.arpjava.solid.srp.User;

//Pierwszy sposób rozszerzenia klasy User

//żeby zmienić formatowanie danych zwracanych przez getFirstName
//możemy rozszerzyc klasę i nadposać getter
public class CapitalUser extends User {

    public CapitalUser(String firstName, String lastName, String password, String email) {
        super(firstName, lastName, password, email);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName().toUpperCase();
    }
}
