
public class Main {
    public static void main(String[] args) {
        Trello trello = new Trello();
        trello.postTweetFunction(101,"Hello it is my first post !!");
        trello.postTweetFunction(102,"Hello it is my second post !!");
        trello.postTweetFunction(102,"Hello it is my third post !!");
        trello.postTweetFunction(102,"Hello it is my fourth post !!");
        trello.postTweetFunction(102,"Hello it is my fifth post !!");
        trello.followFunction(101,102);
        trello.unfollowFunction(102,22);
        System.out.println(trello.followersMap);
        trello.displayRecentPosts();
    }
}
