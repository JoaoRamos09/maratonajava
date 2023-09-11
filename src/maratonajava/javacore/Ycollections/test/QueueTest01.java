package maratonajava.javacore.Ycollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("B");
        queue.add("C");
        queue.add("A");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());   //retorna a queue ordenada pelo equals passado neste caso é pela string;
            //System.out.println(queue.remove()); //remove e retorna a primeira letra mas n passa null caso n tenha
            //System.out.println(queue.peek());
        }
    }
}
