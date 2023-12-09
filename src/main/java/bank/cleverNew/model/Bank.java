package bank.cleverNew.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "banks")
public class Bank {
    @Id
    @GeneratedValue
    private Long id;

    private String text;
    private String name;
}
