package Tasks.Task2a;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person("John", "London");

        System.out.println(person1.getName());
        System.out.println(person1.getAddress());

        System.out.println(person1);
    }
}
