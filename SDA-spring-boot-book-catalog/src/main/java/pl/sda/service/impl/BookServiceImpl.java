package pl.sda.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.model.Book;
import pl.sda.repository.BookRepository;
import pl.sda.service.BookService;

import java.util.List;

@Slf4j
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book getByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Transactional
    @Override
    public void deleteByIsbn(String isbn) {
        bookRepository.deleteByIsbn(isbn);
    }

    public List<Book> getAll(int pageNo, int pageSize, String sortBy) {

        Pageable pageRequest = PageRequest.of(pageNo - 1, pageSize, Sort.by(sortBy));

        Page<Book> bookPage =  bookRepository.findAll(pageRequest);

        log.info("Total pages: " + bookPage.getTotalPages());
        log.info("Total elements in Book table: " + bookPage.getTotalElements());
        log.info("Elements in this page: " + bookPage.getNumberOfElements());
        log.info("Page number: " + bookPage.getNumber());

        return bookPage.getContent();
    }
}

