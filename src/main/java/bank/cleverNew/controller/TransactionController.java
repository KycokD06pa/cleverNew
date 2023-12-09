package bank.cleverNew.controller;


import bank.cleverNew.model.Bank;
import bank.cleverNew.model.Transaction;
import bank.cleverNew.service.BankService;
import bank.cleverNew.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/transactions")
@AllArgsConstructor
public class TransactionController {
    private TransactionService service;

    @GetMapping
    public List<Transaction> findAll(){
        return service.findAll();
    }

    @PostMapping("/save_transaction")
    public String addTransaction(@RequestBody Transaction transaction){

        service.addTransaction(transaction);
        return "fine";
    }
    @PutMapping("/withdraw/{id}")
    public String withdraw(@PathVariable Long id, @RequestParam double value){
        service.withdraw(id, value);
        return "fine";
    }

    @PutMapping("/refill/{id}")
    public String refill(@PathVariable Long id, @RequestParam double value){
        service.refill(id, value);
        return "fine";
    }


    @GetMapping("/{id}")
    public Transaction getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PutMapping("/update_transaction")
    public Transaction updateBank(@RequestBody Transaction transaction){
        return service.updateTransaction(transaction);
    }

    @DeleteMapping("/delete_transaction/{id}")
    public void deleteTransaction(@PathVariable Long id){
        service.delete(id);
    }

}
