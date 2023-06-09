/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_19_tradicion_fdich;

/**
 *
 * @author W11
 */
public class EVA_1_19_Tradicion_FDICH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int [20];
        //Llenarle de aleatorios
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        //imprimirlo
        //for(tipo de dato del arreglo variable: arreglo)
        for (int i : arreglo) {
            System.out.print("[" + i + "]");
        }
        String[] arreCade = new String[20];
            for (String string : arreCade) {
                
            }
        
    }
    
    
}
