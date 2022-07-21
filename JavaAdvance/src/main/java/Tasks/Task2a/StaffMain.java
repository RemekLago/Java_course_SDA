package Tasks.Task2a;

public class StaffMain {
    public static void main(String[] args) {

        Person person1 = new Person("John", "London");
        Student student1 = new Student("matehematic", 2010, 2000);
        Lecture lecture1 = new Lecture("sociology", 6000);

        System.out.println(person1.getName());
        System.out.println(person1.getAddress());

        System.out.println(person1);
        System.out.println(student1);
        System.out.println(lecture1);
    }
}
