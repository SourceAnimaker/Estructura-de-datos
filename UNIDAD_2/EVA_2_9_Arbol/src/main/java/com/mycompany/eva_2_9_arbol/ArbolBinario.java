/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_9_arbol;

/**
 *
 * @author W11
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        root = null; // Arbol vacio
    }

    public void add(int value) {
        Nodo newNodo = new Nodo(value); // Se crea un nuevo objeto tipo node

        // Validar si el arbol esta vacio o no
        if (root == null) {
            root = newNodo; // Si esta vacio root es igual al nuevo nodo
        } else {
            addNode(root, newNodo);
        }
    }

    private void addNode( Nodo currentNode, Nodo newNode) {
        // Validar si nuevo valor va posicionado a la izquierda, a la derecha o es existente
        if (currentNode.getValue() > newNode.getValue()) {
            if (currentNode.getLeft() == null) { // Posicionamos el nodo nuevo a la izquierda del nodo actual si esta vacio
                currentNode.setLeft(newNode);
            } else {
                addNode((Nodo) currentNode.getLeft(), newNode);
            }
        } else if (currentNode.getValue() < newNode.getValue()) { // Se posiciona a la derecha
            if (currentNode.getRight() == null) { // Posicionamos el nodo nuevo a la derecha del nodo actual si esta vacio
                currentNode.setRight(newNode);
            } else {
                addNode((Nodo) currentNode.getRight(), newNode);
            }
        } else { // El valor ya existe en el arbol
            System.out.println(String.format("El valor: %s ya existe", newNode.getValue()));
        }
    }

    public void printPreOrder() {
        preOrder(root);
    }

    public void printInOrder() {
        inOrder(root);
    }

    public void printPostOrder() {
        postOrder(root);
    }

    /* Pre Order:
        Lee el valor, recorre izquierda, recorre derecha */
    private void preOrder(Nodo currentNode) {
        if (currentNode != null) {
            System.out.print("[ " + currentNode.getValue() + " ]");
            preOrder((Nodo) currentNode.getLeft());
            preOrder((Nodo) currentNode.getRight());
        }
    }

    /* In Order:
        Recorre izquierda, lee valor, recorre derecha */
    private void inOrder(Nodo currentNode) {
        if (currentNode != null) {
            inOrder((Nodo) currentNode.getLeft());
            System.out.print("[ " + currentNode.getValue() + " ]");
            inOrder((Nodo) currentNode.getRight());
        }
    }

    /* Posr Order:
       Recorre izquierda, recorre derecha, lee valor */
    private void postOrder(Nodo currentNode) {
        if (currentNode != null) {
            postOrder((Nodo) currentNode.getLeft());
            postOrder((Nodo) currentNode.getRight());
            System.out.print("[ " + currentNode.getValue() + " ]");
        }
    }

    void agregarNodo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}