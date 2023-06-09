/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_9_arbol;

/**
 *
 * @author W11
 */
public class Preordenar {
    
    public void imprimePostOrder () {
        Object root = null;
        if (root != null)
            PostOrder ((Nodo) root);
        else
            System.out.println("Arbol vacio");
    }
    private void PostOrder(Nodo actual){
        
        PostOrder(actual.getizq());
        System.out.println("[" + actual.getValor() + "]");
        PostOrder(actual.getder());
    }
    public void imprimePreOrder () {
        Object root = null;
        if (root != null)
            PreOrder ((Nodo) root);
        else
            System.out.println("Arbol vacio");
    }
    private void PreOrder(Nodo actual){
        
        PreOrder(actual.getizq());
        System.out.println("[" + actual.getValor() + "]");
        PreOrder(actual.getder());
    }
    public void imprimeInOrder () {
        Object root = null;
        if (root != null)
            InOrder ((Nodo) root);
        else
            System.out.println("Arbol vacio");
    }
    private void InOrder(Nodo actual){
        
        InOrder(actual.getizq());
        System.out.println("[" + actual.getValor() + "]");
        InOrder(actual.getder());
    }
}
