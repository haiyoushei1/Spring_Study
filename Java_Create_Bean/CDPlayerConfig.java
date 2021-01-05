package Java_Create_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  // 改注解标识这个类为配置类，应包含spring应用上下文中如何创建bean的细节
// @ComponentScan 测试cdPlayer1使用自动扫描方式注入bean
@Import(CDConfig.class)  // 使用@Import可以组合其他配置类
public class CDPlayerConfig {
//    @Bean  // 默认ID为方法名; 使用Bean标识的方法必须返回一个对象，并且这个对象被spring管理，注册为用应用上下文的bean
////@Bean(name="lonelyHeartsClubBand") 可以使用name修改ID
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }

//    @Bean  // DI:这种方法看着像是调用sgtPeppers方法获得对象，实际上spring会拦截所有对bean修饰方法的调用，直接返回这个bean
//    public CDPlayer cdPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }

/*
下面的形式也可以，逻辑和上面是相同的，就是spring直接注入bean。这种的方式会更好用，上面的需要sgtPeppers()，耦合高。
这个就直接让spring注入个符合CompactDisc的bean。
没有要求CompactDisc的bean要去调用其他方法，自动扫描和XML产生的bean都可以用。
这种注入方式应该是：这个配置类及组合的配置类有的bean，如果要使用自动扫描要加@ComponentScan,与@AutoWired有区别，
*/
    @Bean
    public CDPlayer cdPlayer1(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
