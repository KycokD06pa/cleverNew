package bank.cleverNew.service.Impl;

import bank.cleverNew.model.Bank;
import bank.cleverNew.repository.BankRepository;
import bank.cleverNew.service.BankService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BankServiceImpl implements BankService {

        private final BankRepository repository;
        @Override
        public List<Bank> findAll() {
            return repository.findAll();
        }

        @Override
        public Bank getByName(String name) {
            return repository.getByName(name);
        }

        @Override
        public Bank addBank(Bank bank) {
            return repository.save(bank);
        }

        @Override
        public Bank updateBank(Bank bank) {
            return repository.save(bank);
        }

        @Override
        @Transactional
        public void delete(String name) {
            repository.deleteByName(name);
        }

}
