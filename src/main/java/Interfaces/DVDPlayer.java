package Interfaces;

public class DVDPlayer implements MultimediaDevice {

    @Override
    public void play() {
        System.out.println("DVD Player is playing");
    }

    @Override
    public void pause() {
        System.out.println("DVD Player is paused");
    }

    @Override
    public void stop() {
        System.out.println("DVD Player is sopped");
    }
}
