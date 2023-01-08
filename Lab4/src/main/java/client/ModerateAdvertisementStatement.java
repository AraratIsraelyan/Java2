package client;

public class ModerateAdvertisementStatement {
    private User moderator;
    private PostAdvertisementStatement statement;

    public User getModerator() {
        return moderator;
    }

    public void setModerator(User moderator) {
        this.moderator = moderator;
    }

    public PostAdvertisementStatement getStatement() {
        return statement;
    }

    public void setStatement(PostAdvertisementStatement statement) {
        this.statement = statement;
    }
}
