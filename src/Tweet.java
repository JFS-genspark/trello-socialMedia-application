public class Tweet{
    String tweet;
    int time;
    Tweet(String tweet, int time){
        this.tweet = tweet;
        this.time = time;
    }
    public String toString() {
        return "Tweet: \"" + tweet + "\", Time: " + time;
    }
}