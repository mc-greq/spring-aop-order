package example.nio.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AspectOrderOne {

    // this is a collection of our ADVICES

    // start with @Before advice
//    @Before("execution(void addAccount())")
    // here we are using our pointcut declarations and excluding one of them
    @Before("example.nio.aspects.AopExpressionsContainer.accountDaoAddAccount()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n11 ====> Executing @Before advice on addAccount()");

    }

    @Before("example.nio.aspects.AopExpressionsContainer.accountDaoAddAccount() && " +
            "!example.nio.aspects.AopExpressionsContainer.allGetters()")
    public void beforeAddAccountAdviceNo2(){
        System.out.println("12 ====> Another advice to demostrate reusing pointcut");
    }


    @Before("execution(void example.nio.dao.AccountDAO.addAmount(*)) && args(amount)")
    public void beforeAddAmountModifyAmount(int amount){
        System.out.println("\n15 ====> Executing @Before advice intercepting method arguments and doing work on them: " +
                "\n initial amount: " + amount + ", modified amount: " + (amount + 10));
    }



}
