package CommandTemplate;

public class Planner implements Service{
    @Override
    public void performService() {
        Agenda setReminderCommand = new Agenda(this);
        setReminderCommand.execute();
    }
}
