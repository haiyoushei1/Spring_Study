package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
自动发现形式的DI:
通过在构造器加@AutoWired实现
留一个问题：@Autowired在构造器和变量的区别
 */

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired  // Autowired在spring构建bean时尽量满足依赖
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Autowired  // 起到一个自动填充和构造器Auto功能相同
    public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    public CompactDisc getCompactDisc(){
        return cd;
    }
}
