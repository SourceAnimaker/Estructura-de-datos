/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_fibonacci;

/**
 *
 * @author W11
 */
public class EVA1_17_fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 0 1 2 3 4 5 6
        // 1 1 2 3 5 8 13
        System.out.println("fibonacci(6) = " + fibo(6));
    }
    public static int fibo (int posicion) {
        if (posicion == 1)
            return 1;
        else if (posicion == 0)
            return 1;
        else
            return fibo(posicion - 1) + fibo (posicion - 2);
    }
}
