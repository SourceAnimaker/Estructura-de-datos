/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_7_queue;

/**
 *
 * @author W11
 */
public class EVA_2_7_Queue {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);

        try {
            System.out.println(queue);
            System.out.println("Peek: " + queue.peek());
            System.out.println(queue);
            System.out.println("Poll: " + queue.poll());
            System.out.println(queue);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}