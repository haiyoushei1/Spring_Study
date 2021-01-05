package Java_Create_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
测试多个配置类协同:
如果不使用@Import，在CDPlayerConfig中无法获取其他配置类的bean。
猜测：@Bean形式的DI与@AutoWired不同，@Bean形式，只能与本配置类以及@Import的配置类声明的bean进行注入;@AutoWired直接在整个容器中寻找注入？
在研究源码后进行解答

 */

@Configuration
public class CDConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
}
