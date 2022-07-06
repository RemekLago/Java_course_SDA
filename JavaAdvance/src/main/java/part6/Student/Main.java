package part6.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Little", 456);
        Student student2 = new Student("Emily", "Big", 525);
        Student student3 = new Student("Barbra", "Small", 125);
        Student student4 = new Student("Peter", "Huge", 769);
        Student student5 = new Student("Samanta", "Bad", 107);

        Student[] students = new Student[]{student1, student2, student3, student4, student5};
        printingTable(students);
        System.out.println("sorting...");
        Arrays.sort(students);
        System.out.println("sorting finished");
        printingTable(students);

    }
    public static void printingTable(Object[] tableToPrint){
        for (Object obj : tableToPrint){
            System.out.println(obj);
        }
    }
}
