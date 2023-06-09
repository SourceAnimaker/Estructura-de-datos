/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_8_stacks;

import java.util.EmptyStackException;

/**
 *
 * @author W11
 */
public class MyStack {
    private Nodo front;
    private Nodo back;
    private int size;

    public MyStack() {
        front = null;
        back = null;
        size = 0;
    }

    // Agregar un nodo al final de la lista
    // BIG-OH: O(1)
    // Por default se agrega al final
    public void add(int value) {
        Nodo newNodo = new Nodo(value);

        if (front == null) {
            front = newNodo;
            back = newNodo;
        } else {
            // Conectamos el nuevo nodo al final
            back.setNext(newNodo);
            newNodo.setPrev(back);
            back = newNodo;
        }

        size++;
    }

    // Devuelve los valores de la lista formateados
    // O(N)
    public String toString() {
        String text = "[";
        Nodo temp = front;

        while (temp != null) {
            text += temp.getValue();
            temp = temp.getNext();

            if (temp != null) {
                text += ",";
            }
        }

        text += "]";

        return text;
    }

    // Devuelve los valores de la lista formateados
    // O(N)
    public String reverseToString() {
        String text = "[";
        Nodo temp = back;

        while (temp != null) {
            text += temp.getValue();
            temp = temp.getPrev();

            if (temp != null) {
                text += ",";
            }
        }

        text += "]";

        return text;
    }

    // Devuelve el tamaño de la lista
    // O(1)
    public int getSize() {
        return size;
    }
    // O(N)
//    public int getSize() {
//        Nodo temp = front;
//        int count = 0;
//
//        while (temp != null) {
//            count++;
//            temp = temp.getNext();
//        }
//
//        return count;
//    }

    // Devuelve si la lista esta vacia
    // O(1)
    public boolean isEmpty() {
        return front == null;
    }

    // O(1)
    public void empty() {
        front = null;
        back = null;
        size = 0;
    }

    // Agregar un nodo en la posición deseada
    // O(N)
    public void addAt(int value, int pos) throws Exception {
        int nodeCount = getSize();

        // Validad posición
        if ((pos >= 0) && (pos < nodeCount)) {
            Nodo newNodo = new Nodo(value);

            if (pos == 0) { // Agregar en la posición 0
                newNodo.setNext(front);
                front.setPrev(newNodo);
                front = newNodo;
            } else { // Agregar en cualquier otra posición
                // Se recorren los nodos hasta el nodo anterior a la posición deseada
                Nodo temp = front;
                int nodesPos = 0;

                while (nodesPos < pos) {
                    temp = temp.getNext();
                    nodesPos++;
                }

                // Se conecta el nuevo nodo en la posición deseada
                newNodo.setNext(temp);
                newNodo.setPrev(temp.getPrev());
                temp.getPrev().setNext(newNodo);
                temp.setPrev(newNodo);
            }

            size++;
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }

    }

    // Eliminar un elemento en la posición indicada
    // O(N)
    public void deleteAt(int pos) throws Exception {
        int nodeCount = getSize();

        // Validar posición
        if ((pos >= 0) && (pos < nodeCount)) {

            if (nodeCount == 1) {
                empty();
            } else if (pos == 0) {
                front = front.getNext();
                front.setPrev(null);
                size--;
            } else {
                // Se recorren los nodos hasta el nodo anterior a la posición deseada
                Nodo temp = front;
                int nodesPos = 0;

                while (nodesPos < pos) {
                    temp = temp.getNext();
                    nodesPos++;
                }

                Nodo der = temp.getNext();
                Nodo izq = temp.getPrev();
                izq.setNext(der);

                // Ultimo nodo
                if (temp.getNext() == null) {
                    back = izq;
                } else {
                    der.setPrev(izq);
                }

                size--;
            }
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }
    }

    // Buscar un valor, si lo encuentra devuelve la posición, en su defecto devuelve -1
    // O(N)
    public int findValuePos(int val) {
        // Se recorren los nodos hasta encontrar el que coincida con el valor
        Nodo temp = front;
        int nodesPos = 0;
        boolean flag = false;

        while (temp != null) {
            if (temp.getValue() == val) {
                flag = true;
                break;
            }
            temp = temp.getNext();
            nodesPos++;
        }

        if (!flag)
            nodesPos = -1;

        return nodesPos;
    }

    // Busca un posición y devuelve el valor en esa posición
    // O(N)
    public int findPos(int pos) throws Exception {
//        int nodeCount = size;
          int nodeCount = getSize();

        // Validar posición
        if ((pos >= 0) && (pos < nodeCount)) {
            // Se recorren los nodos hasta el nodo de la posición deseada
            Nodo temp = front;
            int nodesPos = 0;

            while (nodesPos < pos) {
                temp = temp.getNext();
                nodesPos++;
            }

            return temp.getValue();
        } else {
            throw new Exception(String.format("La posición ingresada no es una posición de inserción valida !!"));
        }
    }

    /* Metodos necesarios para stack */
    /* Colocar un valor en la cima de la pila
        Colocar un valor al final de la lista */
    public void push(int value) {
        add(value);
    }

    /* Peek devuelve el valor que se encuentra en la cima de la pila
        (Al final de la lista) O(1) */
    public int peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        return back.getValue();
    }

    /* Pop devuelve y elimina el valor que se encuentra en la cima de la pila
        (Al final de la lista) O(1) */
    public int pop() {
        int value = peek();
        back.getPrev().setNext(null);
        back = back.getPrev();

        return value;
    }

}