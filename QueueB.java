import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class QueueB {
    //static class Queue {
        // static int arr[];
        // static int size;
        // static int rear;
        // static int front;

        // Queue(int n){
        //     arr = new int[n];
        //     size = n;
        //     rear = -1;
        //     front = -1;
        // }
        // public static boolean isEmpty(){
        //     return rear == -1 && front == -1; //It returns true is rear == -1 and front == -1
        // }
        // public static boolean isFull(){
        //     return (rear + 1) % size == front;
        // }
        // //Add
        // public static void add(int data){
        //     if(isFull()){
        //         System.out.println("Queue is Full");
        //         return;
        //     }
        //     //Adding First Element
        //     if(front == -1){
        //         front = 0;
        //     }
        //     rear = (rear + 1) % size;
        //     arr[rear] = data;
        // }
        // //Remove
        // public static int remove(){
        //     if(isEmpty()){
        //         System.out.println("Empty Queue");
        //         return -1;
        //     }
        //     int result = arr[front];            
        //     //Last Element Delete or Remove
        //     if(rear == front){
        //         rear = front = -1;
        //     } else {
        //         front = (front+1) % size;
        //     }
        //     return result;
        // }
        // //Peek
        // public static int peek(){
        //     if(isEmpty()){
        //         System.out.println("Empty Queue");
        //         return -1;
        //     }
        //     return arr[front];
        // }
    //}
    // static class Queue {
    //     static Stack<Integer> s1 = new Stack<>();
    //     static Stack<Integer> s2 = new Stack<>();

    //     public static boolean isEmpty(){
    //         return s1.isEmpty();
    //     }

    //     //Add
    //     public static void add(int data){
    //         while(!s1.isEmpty()){
    //             s2.push(s1.pop());
    //         }
    //         s1.push(data);
    //         while (!s2.isEmpty()) {
    //             s1.push(s2.pop());
    //         }
    //     }

    //     //Remove
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is Empty");
    //             return -1;
    //         }
    //         return s1.pop();
    //     }

    //     //Peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is Empty");
    //             return -1;
    //         }
    //         return s1.peek();
    //     }
    // }
    //Deque implementation
    // static class Stack {
    //     Deque<Integer> deque = new LinkedList<>();

    //     public void push(int data){
    //         deque.addLast(data);
    //     }

    //     public int pop(){
    //         return deque.removeLast();
    //     }

    //     public int peek(){
    //         return deque.getLast();
    //     }
    // }
    //Implementing Queue Using Deque
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        // Queue q = new Queue(5);
        //Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);        
        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        //Queue Using Two Stack
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        //Deque
        // Deque<Integer> deque = new LinkedList<>();
        // deque.addFirst(1);
        // deque.addFirst(2);
        // deque.addLast(3);
        // deque.addLast(4);
        // System.out.println(deque);
        // deque.removeLast();
        // System.out.println(deque);
        // System.out.println("First Element:- "+ deque.getFirst());
        // System.out.println("Last Element:- "+ deque.getLast());

        //Implementing Stack Using Deque
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println("Peek:- " + s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        //Implementing Queue Using Deque
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek:- "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}