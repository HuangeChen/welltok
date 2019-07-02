package welltokchallenge.demo.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import welltokchallenge.demo.domain.Book;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void findAll() {
        List<Book> list = bookService.findAll();
        for (Book b : list) {
            System.out.println(b);
        }
    }

    @Test
    public void findById(){
        Book book = bookService.findById(1);
        System.out.println(book);
    }

    @Test
    public void save(){
        Book book = new Book();
        bookService.save(book);
        System.out.println(book);
    }

    @Test
    public void deleteById(){
        Book book = bookService.deleteById(0);

        System.out.println(book);
    }

}