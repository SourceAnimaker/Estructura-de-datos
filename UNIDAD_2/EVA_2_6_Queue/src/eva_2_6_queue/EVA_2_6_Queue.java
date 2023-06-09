/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_6_queue;

/**
 *
 * @author W11
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EVA_2_6_Queue {

    public static void main(String[] args) {
        Queue queue = new LinkedList<Integer>();
        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        Stack stack = new Stack();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }

}