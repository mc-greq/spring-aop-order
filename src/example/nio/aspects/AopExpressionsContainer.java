package example.nio.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopExpressionsContainer {

    // this is how to declare pointcuts
    @Pointcut("execution(void example.nio.dao.AccountDAO.addAccount())")
    public void accountDaoAddAccount(){}

    // pointcut for all getters
    @Pointcut("execution(* get*())")
    public void allGetters(){}

    // pointcut for all setters
    @Pointcut("execution(void set*(..))")
    public void allSetters(){}
}
