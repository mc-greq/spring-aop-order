package example.nio.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

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

    @Before("execution(* example.nio.dao.AccountDAO.checkAccount(..))")
    public void beforeCheckAccountAdviceValues(JoinPoint joinPoint){
        System.out.println("\n33====> Executing @Before advice with method signature");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        // display method signature
        System.out.println("Method: " + methodSignature.toString());

        List<Object> methodArgs = Arrays.asList(joinPoint.getArgs());

        methodArgs.forEach(System.out::println);

    }
}
