package Part5.Library;

public class LibraryMain {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Smith", 40, "fantasy");
        Author author2 = new Author("John", "Smith", 40, "science");
        Author author3 = new Author("John", "Smith", 40, "novels");

        Book book1 = new Book("Book1", 2000, "123", author1, "fantasy");
        Book book2 = new Book("Book2", 2000, "234", author1, "fantasy");
        Book book3 = new Book("Book3", 2000, "235", author1, "fantasy");
        Book book4 = new Book("Book4", 2000, "153", author2, "fantasy");

        Magazine magazine1 = new Magazine("Magazine1", 2000, "153",author1, 34);
        Magazine magazine2 = new Magazine("Magazine2", 2000, "153",author2, 35);
        Magazine magazine3 = new Magazine("Magazine3", 2000, "153",author3, 36);
        Magazine magazine4 = new Magazine("Magazine4", 2000, "153",author3, 37);

        Position[] tableOfPositions = new Position[]
                {book1, book2, book3, book4, magazine1, magazine2, magazine3, magazine4};

//        Library.findTitle(tableOfPositions, "Book1");
    }
}
