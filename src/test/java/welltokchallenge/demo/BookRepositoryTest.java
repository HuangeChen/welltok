package welltokchallenge.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import welltokchallenge.demo.domain.Book;
import welltokchallenge.demo.repository.BookRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository repository;

    @Test
    public void findAll(){
        List<Book> list = repository.findAll();
        for (Book b : list) {
            System.out.println(b);
        }
    }

    @Test
    public void findById(){
        Book book = repository.findById(1);
        System.out.println(book);
    }

    @Test
    public void save(){
        Book book = new Book();
        repository.save(book);
        System.out.println(book);
    }

    @Test
    public void deleteById(){
        Book book = repository.deleteById(1);

        System.out.println(book);
    }



}