package Java_Create_Bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)

//测试的时候变量一定要加@AutoWired

public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
        cd.play();
        assertNotNull(cdPlayer);
        cdPlayer.play();
    }

}
