package Day52_Collection_FramWork_Intro;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("B");
        queue.add("A");
        queue.add("D");
        queue.add("C");


        // poll() method, it first sort the objects and then remove the fist one
        String q1 = queue.poll(); // A
        System.out.println(q1);

        System.out.println(queue); //[B,C,D]
    }
}
