package bank.cleverNew.service.Impl;

import bank.cleverNew.model.Account;
import bank.cleverNew.model.Transaction;
import bank.cleverNew.repository.AccountRepository;
import bank.cleverNew.repository.TransactionRepository;
import bank.cleverNew.service.AccountService;
import bank.cleverNew.service.TransactionService;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;


@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    EntityManager entityManager;
    private final TransactionRepository repository;
    @Override
    public List<Transaction> findAll() {
        return repository.findAll();
    }

    @Override
    public Transaction getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public Long withdraw(Long id, double value){


        Transaction transaction = getById(id);
            entityManager.createNativeQuery("UPDATE test.transactions set value = " +
                    (transaction.getValue() - value) + " where id = " + transaction.getId()).executeUpdate();
        return id;
    }

    @Override
    @Transactional
    public Long refill(Long id, double value){

        Transaction transaction = getById(id);
        entityManager.createNativeQuery("UPDATE test.transactions set value = " +
                (transaction.getValue() + value) + " where id = " + transaction.getId()).executeUpdate();
        return id;
    }

    @Transactional
    public Long transaction(Long id, double value){

        Transaction transaction = getById(id);
        entityManager.createNativeQuery("UPDATE test.transactions set value = " +
                (transaction.getValue() + value) + " where id = " + transaction.getId()).executeUpdate();


        return id;
    }


}
