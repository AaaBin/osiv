package abin.osiv.entity;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String author;
    @ElementCollection
    private Set<BookProperty> bookProperties;

    public Book(String name, String author, Set<BookProperty> props) {
        this.name = name;
        this.author = author;
        this.bookProperties = props;
    }
}
