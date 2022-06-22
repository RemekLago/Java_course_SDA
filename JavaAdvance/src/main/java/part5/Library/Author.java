package Part5.Library;

public class Author extends Human {
    private String typeWriting;

    public Author(String name, String surname, int age, String typeWriting) {
        super(name, surname, age);
        this.typeWriting = typeWriting;
    }

    public String getTypeWriting() {
        return typeWriting;
    }

    public void setTypeWriting(String typeWriting) {
        this.typeWriting = typeWriting;
    }

}
