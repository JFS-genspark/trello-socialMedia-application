import java.util.*;

public class Trello
{

    LinkedList list = new LinkedList();

    Map<Integer, Set<Integer>> followersMap = new HashMap<>(); // stores the followers
    int timeCalculation = 1;

    public void postTweetFunction (int userId, String tweet){ // post  tweet using the userId with timestamp included
        if(Objects.equals(tweet, " ")) return ;
        list.buildList(userId,tweet,timeCalculation++);
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

    public void displayRecentPosts() {
        //  Filter relevant tweets into a new temporary linked list
        Tweet temp = list.head;
        Tweet filteredHead = null;

        while (temp != null) {
            int tweetUserId = temp.data;
                // Add to filtered list
                Tweet newNode = new Tweet(tweetUserId, temp.tweet, temp.time);
                newNode.next = filteredHead;
                filteredHead = newNode;

            temp = temp.next;
        }

        // Sort filtered list by time in descending order using bubble sort
        if (filteredHead == null || filteredHead.next == null) return; // Nothing to sort

        boolean swapped;
        do {
            swapped = false;
            Tweet current = filteredHead;
            Tweet prev = null;

            while (current.next != null) {
                if (current.time < current.next.time) {
                    // Swap nodes
                    Tweet nextNode = current.next;
                    current.next = nextNode.next;
                    nextNode.next = current;

                    if (prev == null) {
                        filteredHead = nextNode;
                    } else {
                        prev.next = nextNode;
                    }

                    swapped = true;
                    prev = nextNode;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        } while (swapped);

        // Print sorted tweets
        Tweet sorted = filteredHead;
        while (sorted != null) {
            System.out.println("[userId: " + sorted.data + ", " + sorted.tweet + ", Tweet stampNo: " + sorted.time + "]");
            sorted = sorted.next;
        }
    }

}