package welltokchallenge.demo.repository;

import org.springframework.data.repository.CrudRepository;
import welltokchallenge.demo.domain.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Integer>{
    List<Book> findAll();
    Book findById(int id);
    Book save(Book book);
    Book deleteById(int id);
}
