package CommandTemplate;

public class EmailEditor implements Command{

    Service theEmail;

    public EmailEditor(Service newEmail){
        theEmail = newEmail;
    }

    @Override
    public void execute() {
        System.out.println("Email editor is sending an email.");
    }
}
