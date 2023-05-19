package CommandTemplate;

public class MusicPlayer implements Service{
    @Override
    public void performService() {
        Playlist playMusicCommand = new Playlist(this);
        playMusicCommand.execute();
    }
}
