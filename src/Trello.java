import java.util.*;

public class Trello
{
    public static class Tweet{
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

    Map<Integer, List<Tweet>> tweetsMap = new HashMap<>(); // stores the tweets posted by user , key as userId
    Map<Integer, Set<Integer>> followersMap = new HashMap<>(); // stores the followers
    int timestamp = 0;

    public void postTweetFunction (int userId, String tweet){ // post  tweet using the userId with timestamp included
        if(Objects.equals(tweet, " ")) return ;
        tweetsMap.putIfAbsent(userId, new ArrayList<>());
        tweetsMap.get(userId).add(new Tweet(tweet,timestamp++));
    }

    public void followFunction (int followerId, int followingId){ // user can follow another user
        if(followerId == followingId) return;
        followersMap.putIfAbsent(followerId,new HashSet<>());
        followersMap.get(followerId).add(followingId);
    }

    public void unfollowFunction (int followerId, int followingId){ // user can unfollow another user
        if(followersMap.containsKey(followerId)) {
            followersMap.get(followerId).remove(followingId);
        }
    }




}