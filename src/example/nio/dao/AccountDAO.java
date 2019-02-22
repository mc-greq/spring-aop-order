package example.nio.dao;

import example.nio.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println(getClass() + ": doing some db work: add account");
    }

    public void addAccount(Account account){
        System.out.println(getClass() + ": account method with Account param");
    }

    public void addAmount(int amount){
        System.out.println(getClass() + ": adding " + amount + "$ the account");
    }

}
