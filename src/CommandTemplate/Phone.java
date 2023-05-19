package CommandTemplate;

public class Phone implements Service{
    @Override
    public void performService() {
        PhoneDialer makeCallCommand = new PhoneDialer(this);
        makeCallCommand.execute();
    }
}
