package CommandTemplate;

public class Playlist implements Command {

    Service theMusic;

    public Playlist(Service newMusic) {
        theMusic = newMusic;
    }

    @Override
    public void execute() {
        System.out.println("Starting playlist...");
    }
}

