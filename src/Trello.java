import java.util.*;

public class Trello
{

    LinkedList list = new LinkedList();

    Map<Integer, Set<Integer>> followersMap = new HashMap<>(); // stores the followers
    int timecalculation = 1;

    public void postTweetFunction (int userId, String tweet){ // post  tweet using the userId with timestamp included
        if(Objects.equals(tweet, " ")) return ;
        list.buildList(userId,tweet,timecalculation++);
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

    public void displayPost(){
        while (list.head != null) {
            System.out.println(  "[userId :"+list.head.data+ ", " + list.head.tweet+", Tweet stampNo : "+ list.head.time +"]");
            list.head = list.head.next;
        }
    }
}