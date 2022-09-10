package pl.sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByIsbn(String isbn);

    void deleteByIsbn(String isbn);

}

