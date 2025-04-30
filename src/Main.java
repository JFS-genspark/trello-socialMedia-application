public class Main {
    public static void main(String[] args) {
        Trello trello = new Trello();
        trello.postTweetFunction(1,"Hello it is my first post !!");
        trello.followFunction(1,22);
        System.out.println(trello.followersMap);
        System.out.println(trello.tweetsMap);
    }
}
