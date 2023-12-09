package bank.cleverNew.service;

import bank.cleverNew.model.Bank;

import java.util.List;

public interface BankService {
    List<Bank> findAll();
    Bank getByName(String name);
    Bank addBank(Bank bank);
    Bank updateBank(Bank bank);
    void delete(String name);
}
