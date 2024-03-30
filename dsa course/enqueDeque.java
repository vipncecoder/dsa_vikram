import java.util.*;

class enqdeq { // we can use built in linkedList class for queue maipulating
    private ArrayList<Integer> arr;
    private int front;

    public enqdeq() {
        arr = new ArrayList<>();
        int front = 0;
    }
    public void push(int x){
        arr.add(x);
    }
    public void pop(){
        front+=1;
    }
    public int peek(){
        return arr.get(front);
    }
    public boolean empty(){
        return front==arr.size();
    }
}

public class enqueDeque {
    public static void main(String[] args) {
        enqdeq s= new enqdeq();
        s.push(7);
        s.push(2);
        System.out.println(s.peek());
        
    }
}
