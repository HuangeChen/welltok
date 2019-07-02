package welltokchallenge.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import welltokchallenge.demo.domain.Book;
import welltokchallenge.demo.services.BookService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }

    @GetMapping(path="1")
    public List<Book> getBooks() {
        List<Book> books = bookService.findAll();
        return  books;
    }

    @CrossOrigin
    @GetMapping(path="2/{id}")
    public Book findById(@PathVariable int id) {

        Book book = bookService.findById(id);
        return book;
    }

    @CrossOrigin
    @PostMapping(path="3")
    public Book addBook(@RequestBody Book book) {

        Book newBook = bookService.save(book);
        return newBook;
    }

      //  @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping(path = "4/{id}")
    public Book deleteBook(@PathVariable int id) {
        Book thebook = bookService.findById(id);
        bookService.deleteById(thebook.getId());
        return thebook;
    }

}
