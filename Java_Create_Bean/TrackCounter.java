package Java_Create_Bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/*
使用参数继承的形式，关键在args，通过args(trackNumber)就能够把play函数的参数提取出来并且赋给trackNumber
后面标识切点的时候，都有这个参数了
 */
@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut(
            "execution(* Java_Create_Bean.CompactDisc.play(int))"
            + "&& args(trackNumber)")
    public void trackPlayed(int trackNumber){};

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber)
                ? trackCounts.get(trackNumber) : 0;
    }

}
