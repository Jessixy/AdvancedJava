package interfaces;

public class Audio implements Playable {

    @Override
    public void play() {
        System.out.println("Playing audio");
    }
}
