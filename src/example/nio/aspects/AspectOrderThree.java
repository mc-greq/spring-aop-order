package example.nio.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class AspectOrderThree {

    @Before("execution(* add*(example.nio.Account))")
    public void beforeAddAccountWithParam(){
        System.out.println("\n31 ====> Executing @Before advice matchin on parameter Account");
    }

    @Before("execution(void add*())")
    public void beforeAddAccountAdviceWildcard(){
        System.out.println("\n32 ====> Executing @Before advice with wildcard on add*()");

    }
}
