package Part5.Library;

public class Book extends Position {
    private String typeOfBook;
    public static int counter;

    public Book(String title, int year, String isbn, Author author, String typeOfBook) {
        super(title, year, isbn, author);
        this.typeOfBook = typeOfBook;
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(String typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "typeOfBook='" + typeOfBook + '\'' +
                '}';
    }
}
