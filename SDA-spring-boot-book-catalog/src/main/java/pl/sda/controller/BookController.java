package pl.sda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.Book;
import pl.sda.service.BookService;

@Slf4j
@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books/list")
    public String bookList(ModelMap modelMap) {
        modelMap.addAttribute("books", bookService.getAll());

        String currentUser = SecurityContextHolder.getContext().getAuthentication().getName();
        modelMap.addAttribute("currentUser", currentUser);

        return "book-list";
    }

    @GetMapping("/admin/books/edit/{isbn}")
    public String showEditBookForm(@PathVariable String isbn, ModelMap modelMap) {
        modelMap.addAttribute("book", bookService.getByIsbn(isbn));
        return "book-edit";
    }

    @PostMapping("/admin/books/update")
    public String handleUpdatedBook(@ModelAttribute Book book) {
        log.info("Handle updated book: " + book);

        bookService.update(book);
        return "redirect:/books/list";

    }

    @GetMapping("/admin/books/delete/{isbn}")
    public String deleteBook(@PathVariable String isbn) {
        log.info("Deleted book with isbn " + isbn);
        bookService.deleteByIsbn(isbn);
        return "redirect:/books/list";
    }

    @GetMapping("/books/list/params")
    public String bookListParametrized(ModelMap modelMap,
                                       @RequestParam(defaultValue = "1") Integer pageNo,
                                       @RequestParam(defaultValue = "2") Integer pageSize,
                                       @RequestParam(defaultValue = "id") String sortBy) {
        modelMap.addAttribute("books", bookService.getAll(pageNo, pageSize, sortBy));
        return "book-list";
    }

    @GetMapping("/books/details/{isbn}")
    public String bookDetails(@PathVariable String isbn, ModelMap modelMap) {
        modelMap.addAttribute("book", bookService.getByIsbn(isbn));
        return "book-details";
    }

}

