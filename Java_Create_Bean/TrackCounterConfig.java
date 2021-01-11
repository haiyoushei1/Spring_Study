package Java_Create_Bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    @Qualifier("track")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
