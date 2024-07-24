package interfaces;

public class Video implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Video");
    }
}
