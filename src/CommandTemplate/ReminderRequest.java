package CommandTemplate;

public class ReminderRequest extends UserRequest{

    boolean userWantsToSetReminder(){
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

    }

    @Override
    void setReminder() {
        Service newReminder = new Planner();
        newReminder.performService();
    }
}
