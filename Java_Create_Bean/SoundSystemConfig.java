package Java_Create_Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
如果另搞个父类，将两个配置类组合在一起也可以
但是本人在测试时发现，IDEA并没有消除CDPlayerConfig中Bean的error标识，仍然认为，CompactDisc没有被注入。
但从结果看，确实是进行了注入
 */

@Configuration
@Import({CDConfig.class, CDPlayerConfig.class})
public class SoundSystemConfig {
}
