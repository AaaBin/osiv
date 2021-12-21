package abin.osiv;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abin.osiv.entity.Book;
import abin.osiv.entity.BookProperty;

import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
@RequestMapping("book")
public class OsivApplication {

	@Autowired
	private BookService bookService;


	public static void main(String[] args) {
		SpringApplication.run(OsivApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(BookRepository bookRepository) {
		return args -> {
			bookRepository.save(new Book("Dock", "Peter",
					Set.of(new BookProperty("Color", "red"), new BookProperty("Size", "1100kg"))));
			bookRepository.save(new Book("NewApple", "Harry",
					Set.of(new BookProperty("award", "GODD"), new BookProperty("place", "PG"))));
		};
	}

	@GetMapping
	public List<Book> getAllBook() {
		return bookService.getAllBooks();
	}

}
