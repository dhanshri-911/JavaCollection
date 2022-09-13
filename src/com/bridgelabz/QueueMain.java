package com.bridgelabz;


import java.util.LinkedList;
import java.util.Queue;

/*
     * The Queue is an Interface present in java.util package.
     * It is a First In First Out.
     * It maintains Insertion Order.
     * Insertion(Enqueue) performs from which end is called as front and deletion(Dequeue) happens that end calls rear.
     * There are 4 types of Queues==> Simple Queue, Circular ,Double and Priority Queue.
     * Priority queue
     */
    public class QueueMain {

        public static void main(String[] args) {
            Queue<Integer> q = new LinkedList<>();

            // Adds elements {0, 1, 2, 3, 4} to
            // the queue
            for (int i = 0; i < 5; i++)
                q.add(i);

            // Display contents of the queue.
            System.out.println("Elements of queue "
                    + q);

            // To remove the head of queue.
            int removedele = q.remove();
            System.out.println("removed element-"
                    + removedele);

            System.out.println(q);

            // To view the head of queue
            int head = q.peek();
            System.out.println("head of queue-"
                    + head);

            // Rest all methods of collection
            // interface like size and contains
            // can be used with this
            // implementation.
            int size = q.size();
            System.out.println("Size of queue"
                    + size);
        }
    }

