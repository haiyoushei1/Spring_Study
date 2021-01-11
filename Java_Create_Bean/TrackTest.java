package Java_Create_Bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackTest {
    @Autowired
    @Qualifier("track")
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void test(){
        cd.play(1);
        cd.play(1);
        cd.play(2);
        System.out.println(counter.getPlayCount(1));
    }
}
