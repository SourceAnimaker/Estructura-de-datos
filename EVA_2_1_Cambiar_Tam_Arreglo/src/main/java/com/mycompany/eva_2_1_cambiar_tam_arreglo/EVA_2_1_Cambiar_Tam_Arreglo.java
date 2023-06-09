/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_1_cambiar_tam_arreglo;

/**
 *
 * @author W11
 */
public class EVA_2_1_Cambiar_Tam_Arreglo {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        // Sin ninguna utileria
        int[] arrCopy = copyOf(arr, 10);

        for (int el : arrCopy) {
            System.out.println("[" + el + "]");
        }
    }

    public static int[] copyOf(int[] array, int size) {
        int[] newArray = new int[size];
        int index = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            }
        }

        return newArray;
    }
}