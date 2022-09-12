package pl.sda.service;

import pl.sda.model.Book;

import java.util.List;

public interface BookService {

    void save(Book book);

    List<Book> getAll();

    void update(Book book);

    Book getByIsbn(String isbn);

    void deleteByIsbn(String isbn);

    List<Book> getAll(int pageNo, int pageSize, String sortBy);

}
