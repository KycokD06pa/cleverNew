package bank.cleverNew.service;

import bank.cleverNew.model.Bank;
import bank.cleverNew.model.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> findAll();
    Transaction getById(Long id);
    Transaction addTransaction(Transaction transaction);
    Transaction updateTransaction(Transaction transaction);
    void delete(Long id);
    Long withdraw(Long id, double value);

    Long refill(Long id, double value);
}
