package example.nio;

import example.nio.dao.AccountDAO;
import example.nio.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReadJoinPoint {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigurationAop.class, MyLoggerConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        Account account = new Account();

        accountDAO.checkAccount(account, true);
    }
}
