package pl.pszemek.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String message;
    private String author;
    private LocalDate date;

    public Post(String title, String message, String author){
        this.title = title;
        this.message = message;
        this.author = author;
        date = LocalDate.now();
    }
}
