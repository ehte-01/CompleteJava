package Interface.Devices;

public class SmartPhone implements Camera,MusicPlayer,Phone{


    @Override
    public void playMusic() {
        System.out.println("Music is playing");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stops");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling" + number + "from smartphone");
    }

    @Override
    public void endCall() {
        System.out.println("Call ends");
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo clicked");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video is recording");
    }
}
