package bank.cleverNew.service;

import bank.cleverNew.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();
    Account getByNumber(String number);
    Account addAccount(Account account);
    Account updateAccount(Account account);
    void delete(String number);

}
