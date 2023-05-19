package CommandTemplate;

public class PhoneDialer implements Command{

    Service thePhone;

    public PhoneDialer(Service newPhone){
        thePhone = newPhone;
    }

    @Override
    public void execute() {
        System.out.println("Phone dialer is making call...");
    }
}
