package Part5.Library;

import Part5.Library.Author;

public abstract class Position {
    private String title;
    private int year;
    private String isbn;
    protected Author author;

    public Position(String title, int year, String isbn, Author author) {
        this.title = title;
        this.year = year;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
