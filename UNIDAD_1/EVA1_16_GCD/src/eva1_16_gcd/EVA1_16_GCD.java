/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_gcd;

/**
 *
 * @author W11
 */
public class EVA1_16_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println();
    }
     public static int gcd(int num, int div){
            
        if (div == 0)
            return num;
        else{
            int resi = num % div;
            return gcd (div, resi);
        }
            
    }
}
