package Java_Create_Bean;

import org.springframework.stereotype.Component;

// @Component
public class SgtPeppers implements CompactDisc {
    private String title = "title";
    private String artist = "artist + ";
    @Override
    public void play() {
        System.out.println(title + " + " + artist + "JavaCreateBean");
    }
}
