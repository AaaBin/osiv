package abin.osiv.entity;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BookProperty
 */
@Data
@Embeddable
@NoArgsConstructor
public class BookProperty {
    private String name;

    private String value;

    public BookProperty(String name, String value) {
        this.name = name;
        this.value = value;
    }
}