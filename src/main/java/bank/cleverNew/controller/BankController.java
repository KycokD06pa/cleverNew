package bank.cleverNew.controller;


import bank.cleverNew.model.Bank;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import bank.cleverNew.service.BankService;
import java.util.List;

@RestController
@RequestMapping("api/v1/banks")
@AllArgsConstructor
public class BankController {

    private BankService service;

    @GetMapping
    public List<Bank> findAll(){
        return service.findAll();
    }

    @PostMapping("/save_bank")
    public String addBank(@RequestBody Bank bank){
        service.addBank(bank);
        return "fine";
    }

    @GetMapping("/{name}")
    public Bank getByName(@PathVariable String name){
        return service.getByName(name);
    }

    @PutMapping("/update_bank")
    public Bank updateBank(@RequestBody Bank bank){
        return service.updateBank(bank);
    }

    @DeleteMapping("/delete_bank/{name}")
    public void deleteBank(@PathVariable String name){
        service.delete(name);
    }
}
