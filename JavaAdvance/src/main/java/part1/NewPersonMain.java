package part1;

public class NewPersonMain {
    public static void main(String[] args) {

        NewPerson person1 = new NewPerson();
        person1.name = "Ania";
        person1.age = 25;

        NewPerson person2 = new NewPerson();
        person2.name = "Agnieszka";
        person2.age = 45;

        NewPerson person3 = new NewPerson();
        person3.name = "Andrzej";
        person3.age = 65;

        NewPerson person4 = new NewPerson("Ola", 50, 'f');
        NewPerson person5 = new NewPerson("Kasia", 20, 'f');
        NewPerson person6 = new NewPerson("Marek", 30, 'm');

        person1.introduce();
        person2.introduce();
        person3.introduce();

        NewPerson[] table = {person1, person2, person3, person4, person5, person6};

//        for (NewPerson i : table) {
//            i.introduce();
//        }

        showOnlyFemale(table);
        showOnlyMale(table);

    }
    public static void showOnlyFemale(NewPerson[] people) {
        System.out.println("Only women");
        for (NewPerson i : people) {
            if (i.sex == 'f') {
                i.introduce();
            }
        }
    }
    public static void showOnlyMale(NewPerson[] people) {
        System.out.println("Only men");
        for (NewPerson i : people) {
            if (i.sex == 'm') {
                i.introduce();
            }
        }
    }

}
