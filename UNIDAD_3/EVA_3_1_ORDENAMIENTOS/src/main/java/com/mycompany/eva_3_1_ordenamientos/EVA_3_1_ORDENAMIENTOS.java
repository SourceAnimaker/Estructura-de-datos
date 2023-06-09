/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_3_1_ordenamientos;

/**
 *
 * @author W11
 */
public class EVA_3_1_ORDENAMIENTOS {

    public static void main(String[] args) {
        int[] arregloOrig = new int[15];
        llenar(arregloOrig);
        System.out.println("ARRELGO ORIGINAL:------");
        long ini = System.nanoTime();
        imprimir(arregloOrig);
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println("Tiempo de llenado" + tiempo);
        
        System.out.println("SELECTION SORT:++++++++++++++");
        int[] arregloSel = new int[arregloOrig.length];
        copiar(arregloOrig, arregloSel);
        
        
        
        ini = System.nanoTime();
        selectionSort(arregloSel);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(arregloSel);
         System.out.println("Tiempo de selection sort:" + tiempo);
         
        /* System.out.println("INSERTION SORT:++++++++++++++");
        int[] arregloIns = new int[arregloOrig.length];
        copiar(arregloOrig, arregloIns);
        imprimir(arregloIns);
        
        ini = System.nanoTime();
        selectionSort(arregloIns);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(arregloIns);
         System.out.println("Tiempo de insertion sort:" + tiempo);
         
        System.out.println("BUBBLE SORT:++++++++++++++");
        int[] arreglobubble = new int[arregloOrig.length];
        copiar(arregloOrig, arreglobubble);
        imprimir(arreglobubble);
        
        ini = System.nanoTime();
        selectionSort(arreglobubble);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(arreglobubble);
         System.out.println("Tiempo de bubble sort:" + tiempo);
         
        */System.out.println("QUICK SORT:++++++++++++++");
        int[] arregloQuick = new int[arregloOrig.length];
        copiar(arregloOrig, arregloQuick);
        imprimir(arregloQuick);
        
        ini = System.nanoTime();
        selectionSort(arregloQuick);
        fin = System.nanoTime();
        tiempo = fin - ini;
        imprimir(arregloQuick);
         System.out.println("Tiempo de Quick sort:" + tiempo);
    }
    public static void llenar (int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }
    public static void imprimir (int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    public static void copiar (int [] arreglo, int [] copia) {
        
    }
    //SELECTION SORT
    //O(n°2)COMPARACIONES
    //O(n°2)INTERCAMBIO
    public static void selectionSort (int[] arreglo){
        for (int i = 0; i < 10; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                    if(arreglo[j] < arreglo[min])
                        min = j;
            }
            //Intercambia lo "min" e "i" 
            // Swap (Intercambio)
            if (min != i);
            int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
        }
    }
    //O(n): comparaciones
    //O(n*2): intercambios
    public static void insertionSort (int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
        int temp = arreglo[i];
        int insP = i;
            for (int prev = i - 1; prev >=0; prev++) {
                if (arreglo[prev] > temp){
                    arreglo[insP] = arreglo[prev];
                    insP--;
                    }else
                        break;
                }
                arreglo[insP] = temp;
                }
                    }
        public static void bubbleSort(int[] arreglo) {
                    for (int i = 0; i < arreglo.length; i++) {
                        for (int j = 0;  j < (arreglo.length - 1); j++) {
                            if(arreglo[j] > arreglo[j + 1]) {
                                int temp = arreglo[j];
                                arreglo[j] = arreglo[j + 1];
                                arreglo[j + 1] = temp;
                    }
                }
            }
        }
        //QUICKSORT: recursivo
        public static void quickSort(int [] arreglo) {
            quickSortRec (arreglo, 0, arreglo.length -1);
        }
        //Metodo que lo ordena
        private static void quickSortRec(int [] arreglo, int ini, int fin) {
            int pivote, too_big, too_small;
            pivote = ini;
            too_big = ini;
            too_small = fin;
            
            //mover to_big a la derecha y detenernos con valor mayor que pivote
            if(ini < fin){
            while(arreglo[too_big] <= arreglo[pivote] &&
                    (too_big < too_small)) {
                
                too_big++;
            }
            //mover to_small a la derecha y detenernos con valor menor que pivote
            while(arreglo[too_small] >= arreglo[pivote]){
                too_small--;
                
            }
            //SI NO SE CRUZA, INTERCAMBIAN Y REPITE
            
            //SI SE CURZAN, INTERCAMBIA EL PIVOTE CON TO_SMALL Y TERMINAN
            if(too_big < too_small) {//No se cruzan
                int temp = arreglo[too_big];
                arreglo[too_big] = arreglo[too_small];
                arreglo[too_small] = temp;
            }
            //intercambio pivote con too_small
            int temp = arreglo[pivote];
            arreglo[pivote] = arreglo[too_small];
            arreglo[too_small] = temp;
            pivote = too_small;//El Pivote cambio la posicion
            
            quickSortRec(arreglo, ini, pivote -1);
            
            quickSortRec(arreglo, pivote + 1, fin);
            }
        } 
    }


