package CommandTemplate;

public class EmailRequest extends UserRequest{

    boolean userWantsToSendAnEmail(){
        System.out.println("Request type: " + this.getClass());
        return true;
    }

    @Override
    void makeCall() {

    }

    @Override
    void sendEmail() {
        Service newEmail = new Email();
        newEmail.performService();
    }

    @Override
    void playMusic() {

    }

    @Override
    void setReminder() {

    }
}
