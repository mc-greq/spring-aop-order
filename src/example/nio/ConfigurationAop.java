package example.nio;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("example.nio")
@EnableAspectJAutoProxy
public class ConfigurationAop {
}
