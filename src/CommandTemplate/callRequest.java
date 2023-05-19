package CommandTemplate;//Template Design Pattern

public class callRequest extends UserRequest{

    boolean userWantsToMakeACall(){
        System.out.println("Request type: " + this.getClass());
        return true;
    }

    @Override
    void makeCall() {
        Service newPhone = new Phone();
        newPhone.performService();
    }

    @Override
    void sendEmail() {

    }

    @Override
    void playMusic() {

    }

    @Override
    void setReminder() {

    }
}
