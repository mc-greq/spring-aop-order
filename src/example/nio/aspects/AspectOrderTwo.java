package example.nio.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AspectOrderTwo {

    @Before("execution(* add*())")
    public void beforeAddAccountAdviceAnyReturnType(){
        System.out.println("\n21 ====> Executing @Before advice with wildcard matching on return type on add*()");
    }

    @Before("execution(void *())")
    public void beforeAddAccountAdviceVoidType(){
        System.out.println("\n22 ====> Executing @Before advice matching on void functions");
    }
}
