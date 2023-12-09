package bank.cleverNew.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Account senderAccount;
    @OneToOne
    private Account recipientAccount;
    @OneToOne
    private Bank senderBank;// = senderAccount.getBank();
    @OneToOne
    private Bank recipientBank;// = recipientAccount.getBank();

    private double value;


    private LocalTime time;
    private LocalDate date;


}
