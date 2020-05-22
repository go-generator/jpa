package jpa;

import jpa.book.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
    @Autowired
    private BookCategoryRepository bookCategoryRepository;
    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Book b1 = new Book("1", "JPA 1");
        Book b2 = new Book("2", "JPA 2");
        bookRepository.save(b1);
        bookRepository.save(b2);
        bookCategoryRepository.save(new BookCategory("a", "ABC", "Category 1", b1, b2));
//        Optional<BookCategory> b = bookCategoryRepository.findById(new BookCategoryPK("a", "ABC"));
    }
}
