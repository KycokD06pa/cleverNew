package bank.cleverNew.repository;

import bank.cleverNew.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {

        void deleteByName(String name);
        Bank getByName(String name);

        
}
