/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_recusrividad;

/**
 *
 * @author W11
 */
public class EVA1_15_Recusrividad {
    //Factorial

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int facto = 5;
        for (int i = 4; i >= 1; i--) {
            facto = facto * i;
        }
        System.out.println(facto);
    }
    
    public static int factorial(int numero){
        if (numero > 0)
         return numero * factorial(numero - 1);
        else
            return 1;
    }
    //System.out.println(factorial(15));
}
