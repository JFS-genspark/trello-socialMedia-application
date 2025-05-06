
public class Main {
    public static void main(String[] args) {
        Trello trello = new Trello();
        trello.postTweetFunction(101,"Hello it is my first post !!");
        trello.postTweetFunction(102,"Hello it is my second post !!");
        trello.followFunction(101,22);
        trello.unfollowFunction(102,22);
        System.out.println(trello.followersMap);
        trello.displayPost();
    }
}
