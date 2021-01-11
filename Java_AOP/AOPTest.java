package Java_AOP;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AOPConfig.class)
public class AOPTest {
    @Autowired
    @Qualifier("opera")
    Performance performance1;

    @Autowired
    @Qualifier("movie")
    Performance performance2;

    @Test
    public void classNotNull(){
        assertNotNull(performance1);
        performance1.perform();

/*
通过引入后，对performEncore的调用都是通过代理，代理到DefaultEncoreable
一个Performance的bean，内部有两个类，DefaultEncoreable与PerformanceImpl。
通过代理控制访问。
 */
        Encoreable encoreable = (Encoreable) performance1;
        encoreable.performEncore();

        assertNotNull(performance2);
        performance2.perform();

    }
}
