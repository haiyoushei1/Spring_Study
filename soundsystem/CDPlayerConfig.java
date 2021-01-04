package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan  // 默认扫描与配置类相同的包及子包,
@ComponentScan(basePackageClasses = {BeanInterface.class})  // basePackageClasses会指定这些类的所在包为基础包，最好搞个空接口,有利于重构
public class CDPlayerConfig {
}
