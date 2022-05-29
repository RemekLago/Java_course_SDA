package classes.copies;

public class PiesMethods {

    public void changeReference(Pies pies) {
        pies = new Pies();
        pies.name = "szarik";
        System.out.println("PiesMethods-changeReference:" + pies.name);
    }

    public void changeName(Pies pies) {
        pies.name = "szarik";
        System.out.println("PiesMethods-changeReference:" + pies.name);
    }
}
