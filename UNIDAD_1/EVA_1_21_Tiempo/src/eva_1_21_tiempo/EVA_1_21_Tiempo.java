/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_21_tiempo;

/**
 *
 * @author W11
 */
public class EVA_1_21_Tiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int [1000];
        
        long ini = System.nanoTime();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo" + (fin - ini));
    }
        ini = System.nanoTime();
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[j] = (int)(Math.random() * 100);
            }
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo" + (fin - ini));
}
