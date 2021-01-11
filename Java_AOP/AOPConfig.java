package Java_AOP;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
注解形式的AOP是需要@EnableAspectAutoProxy,不然只能是一个普通的bean
通过这个注解开启自动代理功能后，@Aspect被解析，并为这个注解的bean创建一个代理，这个代理会围绕着所有该切面的切点匹配的bean

这里还用了@Quealifier，和Performance匹配的有两个bean，使用这个注解可以对匹配的bean进行限定
 */

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
    @Bean
    @Qualifier("opera")
    public Performance performance(){
        return new PerformanceImpl();
    }
    @Bean
    public Audience audience(){
        return new Audience();
    }
    @Bean
    @Qualifier("movie")
    public PerformanceMovie performanceMovie(){
        return new PerformanceMovie();
    }

    @Bean
    public DefaultEncoreable defaultEncoreable(){
        return new DefaultEncoreable();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return new EncoreableIntroducer();
    }
}
