package CommandTemplate;

public class Agenda implements Command{

    Service thePlan;

    public Agenda(Service newPlan){
        thePlan = newPlan;
    }

    @Override
    public void execute() {
        System.out.println("Setting reminder...");
    }
}
