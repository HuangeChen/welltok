package welltokchallenge.demo.services;

import welltokchallenge.demo.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
    Book save(Book book);
    Book deleteById(int id);
}
