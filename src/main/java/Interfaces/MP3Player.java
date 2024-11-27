package Interfaces;

public class MP3Player implements MultimediaDevice{
    @Override
    public void play() {
        System.out.println("MP3 player is playing ");
    }

    @Override
    public void pause() {
        System.out.println("MP3 player is paused ");

    }

    @Override
    public void stop() {
        System.out.println("MP3 player is stopped ");
    }
}
