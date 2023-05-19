package CommandTemplate;

public class Driver {
    public static void main(String[] args) {
        UserRequest request1 = new callRequest();
        request1.fullfillRequest("MAKE A CALL");
        request1.fullfillRequest("SEND AN EMAIL");

        UserRequest request2 = new EmailRequest();
        request2.fullfillRequest("SEND AN EMAIL");

        UserRequest request3 = new MusicRequest();
        request3.fullfillRequest("PLAY MUSIC");

        UserRequest request4 = new ReminderRequest();
        request4.fullfillRequest("SET REMINDER");
    }
}
