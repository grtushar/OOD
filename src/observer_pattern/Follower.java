package observer_pattern;

public class Follower implements Observer {
    private final String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update(String channelStatus) {

    }

    public void play() {

    }
}
