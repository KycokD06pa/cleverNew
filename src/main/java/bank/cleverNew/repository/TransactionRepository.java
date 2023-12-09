package bank.cleverNew.repository;

import bank.cleverNew.model.Bank;
import bank.cleverNew.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {


    void deleteById(Long id);
    Transaction getById(Long id);


}
