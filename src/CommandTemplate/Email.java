package CommandTemplate;

public class Email implements Service{
    @Override
    public void performService() {
        EmailEditor makeEmailCommand = new EmailEditor(this);
        makeEmailCommand.execute();
    }
}
