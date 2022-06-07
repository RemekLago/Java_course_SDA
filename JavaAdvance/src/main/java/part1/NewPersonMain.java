package Course2;

public class newPersonMain {
    public static void main(String[]args){

        newPerson person1 = new newPerson(Ania, 25);
        newPerson person2 = new newPerson(Andrzej, 54);
        newPerson person3 = new newPerson(Mariola, 68);

        person1.introduce();
        person2.introduce();
        person3.introduce();
    }
}
