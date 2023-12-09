package bank.cleverNew.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
@Table(name = "accounts")
public class Account {
        @Id
        @GeneratedValue
        private Long id;
        //@Column(name="sds")
        @Column(unique = true)
        private String number;
        @OneToOne
        private Bank bank;
        private String name;
        private double value;
}
