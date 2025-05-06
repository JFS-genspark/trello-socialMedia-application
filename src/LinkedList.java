public class LinkedList {
    Tweet head;

    public void buildList(int userId, String tweet, int time){          //build list with nodes
        Tweet node = new Tweet(userId, tweet, time);

        if (head == null) {
            head = node;
            return;
        }

        Tweet current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = node;
    }
}
