/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_2_cambiar_tamaño;

/**
 *
 * @author W11
 */
public class EVA_2_2_Cambiar_Tamaño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[1];
        
        for (int i = 1; i < 10000;i++) {
            int[] copia = cambiarTama(arreglo, i);
            
            copia[i - 1] = (int)(Math.random() * 100);
            arreglo = copia;
        }
    }
    public static int [] cambiarTama (int [] arreglo, int Tama) {
        int[] copia = new int [Tama];
        return null;
    }
}
