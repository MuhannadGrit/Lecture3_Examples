package Interfaces;

interface MultimediaDevice {
    void play();
    void pause();
    void stop();

    default void reset(){
        System.out.println("The device has been reset");
    }
}
