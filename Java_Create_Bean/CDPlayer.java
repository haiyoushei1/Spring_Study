package Java_Create_Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
JavaConfig的DI:
都交由Config文件，直接生成完成DI的bean
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;


    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play(1);
    }
}
