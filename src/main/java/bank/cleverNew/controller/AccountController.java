package bank.cleverNew.controller;

import bank.cleverNew.model.Account;
import bank.cleverNew.model.Bank;
import bank.cleverNew.service.AccountService;
import bank.cleverNew.service.BankService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/accounts")
@AllArgsConstructor
public class AccountController {

    private AccountService service;

    @GetMapping
    public List<Account> findAll(){
        return service.findAll();
    }

    @PostMapping("/save_account")
    public String addAccount(@RequestBody Account account){
        service.addAccount(account);
        return "fine";
    }

    @GetMapping("/{number}")
    public Account getByNumber(@PathVariable String number){
        return service.getByNumber(number);
    }

    @PutMapping("/update_account")
    public Account updateAccount(@RequestBody Account account){
        return service.updateAccount(account);
    }

    @DeleteMapping("/delete_account/{number}")
    public void deleteAccount(@PathVariable String number){
        service.delete(number);
    }
}
