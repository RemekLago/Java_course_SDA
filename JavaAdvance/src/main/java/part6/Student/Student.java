package part6.Student;

public class Student implements Comparable {
    private String name;
    private String surname;
    private int albumNumber;


    public Student(String name, String surname, int albumNumber) {
        this.name = name;
        this.surname = surname;
        this.albumNumber = albumNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAlbumNumber() {
        return albumNumber;
    }

    @Override
    public String toString() {
        return "Student: " + name +" "+ surname + ", albumNumber: " + albumNumber;
    }

    @Override
    public int compareTo(Object obj) {
        Student other = (Student) obj;

//        sort by surname - ascending
//        return this.surname.compareTo(other.surname);
//        sort by name - descending
//        return this.name.compareTo(other.name);

//        sort by albumNumber - ascending
//        return Integer.compare(this.albumNumber, other.albumNumber);
//        return this.albumNumber - other.albumNumber;
//        sort by albumNumber - descending (replace elements in brackets)
        return Integer.compare(other.albumNumber, this.albumNumber);

        //        sort by albumNumber - descending -> *(-1)
//        return Integer.compare(this.albumNumber, other.albumNumber) *(-1);
    }
}
