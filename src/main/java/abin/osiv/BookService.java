package abin.osiv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abin.osiv.entity.Book;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        var all = bookRepository.findAll();
        List<Book> bookList = new ArrayList<>();
        all.iterator().forEachRemaining(bookList::add);
        return bookList;
    }
}
