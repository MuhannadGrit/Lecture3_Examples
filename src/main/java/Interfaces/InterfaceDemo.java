package Interfaces;

public class InterfaceDemo {
    public static void testDevice(MultimediaDevice device){
        device.play();
        device.pause();
        device.stop();
        device.reset();
    }

    public static void main(String[] args) {
        MultimediaDevice dvd = new DVDPlayer();
        MultimediaDevice mp3 = new MP3Player();

        System.out.println("Testing DVD");
        testDevice(dvd);

        System.out.println("Testing MP3");
        testDevice(mp3);
    }
}
