package bank.cleverNew.repository;

import bank.cleverNew.model.Account;
import bank.cleverNew.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    void deleteByNumber(String number);
    Account getByNumber(String number);


}
