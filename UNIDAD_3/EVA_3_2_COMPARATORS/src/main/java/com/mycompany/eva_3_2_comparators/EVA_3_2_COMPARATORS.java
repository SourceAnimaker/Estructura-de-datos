/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_2_comparators;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author W11
 */
public class EVA_3_2_COMPARATORS {

    public static void main(String[] args) {
        
        LinkedList<Integer> Lista = new LinkedList<>();
        Lista.add(100);
        Lista.add(500);
        Lista.add(200);
        Lista.add(800);
        Lista.add(300);
        System.out.println(Lista.toString());
        
        Comparator comparator;
        comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Lista.sort(comparator);
        System.out.println();
        
        LinkedList<String> ListaCade = new LinkedList<>();
        ListaCade.add("Juan");
        ListaCade.add("Adriana");
        ListaCade.add("Pedro");
        ListaCade.add("Zamudio");
        ListaCade.add("Basilio");
        System.out.println(ListaCade.toString());
        
        
        System.out.println(ListaCade.toString());
    }
}
