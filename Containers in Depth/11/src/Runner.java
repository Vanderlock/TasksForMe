//Exercise 11: (2) Create a class that contains an Integer that is initialized to a value
//between o and 100 using java.util.Random. Implement Comparable using this Integer
//field. Fill a PriorityQueue with objects of your class, and extract the values using poll( ) to
//show that it produces the expected order.

import java.util.PriorityQueue;

public class Runner {
    public static void main(String[] args) {
        PriorityQueue<Box> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i<10 ; i++){
            priorityQueue.add(new Box());
        }
        System.out.println(priorityQueue);
        Box box;
        while ((box=priorityQueue.poll()) != null){
            System.out.println(box);
        }
    }
}
