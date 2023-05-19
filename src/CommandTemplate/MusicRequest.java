package CommandTemplate;

public class MusicRequest extends UserRequest{

    boolean userWantsToPlayMusic(){
        System.out.println("Request type: " + this.getClass());
        return true;
    }

    @Override
    void makeCall() {

    }

    @Override
    void sendEmail() {

    }

    @Override
    void playMusic() {
        Service musicPlayer = new MusicPlayer();
        musicPlayer.performService();
    }

    @Override
    void setReminder() {

    }
}
