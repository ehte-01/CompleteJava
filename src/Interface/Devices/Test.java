package Interface.Devices;

public class Test {
    public static void main(String[] args) {

        SmartPhone sp=new SmartPhone();
        sp.makeCall("9328469623");
        sp.endCall();
        sp.playMusic();
        sp.stopMusic();
        sp.takePhoto();
        sp.recordVideo();

    }
}
