package bank.cleverNew.service.Impl;

import bank.cleverNew.model.Account;
import bank.cleverNew.repository.AccountRepository;
import bank.cleverNew.service.AccountService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository repository;
    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public Account getByNumber(String number) {
        return repository.getByNumber(number);
    }

    @Override
    public Account addAccount(Account account) {
        return repository.save(account);
    }

    @Override
    public Account updateAccount(Account account) {
        return repository.save(account);
    }

    @Override
    @Transactional
    public void delete(String number) {
        repository.deleteByNumber(number);
    }
}
