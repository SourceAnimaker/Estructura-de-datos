/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_8_stacks;

/**
 *
 * @author W11
 */
public class EVA_2_8_Stacks {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(400);

        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack);
        System.out.println("Poll: " + stack.pop());
        System.out.println(stack);
    }

}