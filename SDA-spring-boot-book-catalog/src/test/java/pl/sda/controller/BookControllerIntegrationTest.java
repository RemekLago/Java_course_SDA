package pl.sda.controller;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import pl.sda.dto.UserDto;
import pl.sda.exception.EmptyUsernameException;
import pl.sda.exception.InvalidPasswordException;
import pl.sda.exception.PasswordMismatchException;
import pl.sda.exception.UsernameExistsException;
import pl.sda.model.Book;
import pl.sda.model.User;
import pl.sda.repository.UserRepository;
import pl.sda.service.BookService;
import pl.sda.service.UserService;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class BookControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BookService bookService;

    @Autowired
    private UserRepository userRepository;

    @WithMockUser(username = "user", password = "pass", roles = "USER")
    @Test
    public void shouldReturnBookList() throws Exception {
        //given when then
        mockMvc.perform(MockMvcRequestBuilders.get("/books/list"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("book-list"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("books"))
                .andExpect(MockMvcResultMatchers.model().attribute("books", Matchers.notNullValue()))
                .andExpect(MockMvcResultMatchers.model().attributeExists("currentUser"))
                .andExpect(MockMvcResultMatchers.model().attribute("currentUser", Matchers.equalTo("user")));
    }

    @WithMockUser(username = "admin", password = "pass", roles = "ADMIN")
    @Test
    public void shouldUpdateBook() throws Exception {
        //given
        Book testBook = getTestBook();
        bookService.save(testBook);

        //when
        mockMvc.perform(MockMvcRequestBuilders.post("/admin/books/update")
                        .param("id", testBook.getId().toString())
                        .param("title", testBook.getTitle() + " updated")
                        .param("author", testBook.getAuthor())
                        .param("description", testBook.getDescription())
                        .param("isbn", testBook.getIsbn())
                        .param("releaseDate", testBook.getReleaseDate().toString())
                )//zakończenie metody perform
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.view().name("redirect:/books/list"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/books/list"));

        //then
        Book bookFromDB = bookService.getByIsbn(testBook.getIsbn());
        Assertions.assertEquals(testBook.getTitle() + " updated", bookFromDB.getTitle());
    }

    @WithMockUser(username = "admin", password = "pass", roles = "ADMIN")
    @Test
    public void shouldDeleteBook() throws Exception {
        //given
        Book testBook = getTestBook();
        bookService.save(testBook);

        //when
        mockMvc.perform(MockMvcRequestBuilders.get("/admin/books/delete/" + testBook.getIsbn()))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.view().name("redirect:/books/list"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/books/list"));

        //then
        Book bookFromDB = bookService.getByIsbn(testBook.getIsbn());
        Assertions.assertNull(bookFromDB);
    }

    @WithMockUser(username = "user", password = "pass", roles = "USER")
    @Test
    public void shouldReturnBookDetails() throws Exception {
        //given
        Book testBook = getTestBook();
        bookService.save(testBook);

        //when
        mockMvc.perform(MockMvcRequestBuilders.get("/books/details/" + testBook.getIsbn()))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("book-details"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("book"))
                .andExpect(MockMvcResultMatchers.model().attribute("book", Matchers.notNullValue()))
                .andExpect(MockMvcResultMatchers.model().attribute("book", Matchers.equalTo(testBook)));
    }


    private Book getTestBook() {
        Book testBook = new Book();
        testBook.setId(4);
        testBook.setTitle("Testowy");
        testBook.setAuthor("Testowy");
        testBook.setIsbn("1234567891015");
        testBook.setDescription("testowy opis");
        testBook.setReleaseDate(LocalDate.of(2014, 11, 10));
        return testBook;
    }

    private UserDto getTestUserDto() {
        return new UserDto("testuser", "Pass123!", "Pass123!");
    }
}
