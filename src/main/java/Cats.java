import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public Cats(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "User:" +
                "\n" + user + "(" + id + ")" +
                "\nwrote an interesting fact in a topic: " + type +
                "\n" + text +
                "\n" + upvotes + " likes" + "\n";
    }
}
