public class Tweet{         //creating tweet node for the linkedList
    int data;
    String tweet;
    int time;
    Tweet next;
    Tweet(int data, String tweet, int time){
        this.data = data;
        this.tweet = tweet;
        this.time = time;
        this.next = null;
    }
}