/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_18_numeros_primos;

/**
 *
 * @author W11
 */
public class EVA_1_18_Numeros_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ini = System.nanoTime();
        System.out.println("101: " + calcularEsPrimoInef(100));
        long fin = System.nanoTime();
        System.out.println("Tiempo ineficiente: " + (fin - ini));
        
        ini = System.nanoTime();
        System.out.println("101: " + calcularEsPrimoEf(100));
        fin = System.nanoTime();
        System.out.println("Tiempo ineficiente: " + (fin - ini));
    }
    public static boolean calcularEsPrimoInef(int nume){
        boolean resu = false;
        int fin = (int) Math.sqrt(nume);
        for (int i = 2; i < fin; i++) {
            int resi = nume % i;
            if (resi == 0) {
                resu = false;
                        break;
            }
        }
        return false;
        
    }
    public static boolean calcularEsPrimoEf(int nume){
        boolean resu = false;
            int fin = (int) Math.sqrt(nume);
            for (int i = 2; i < fin; i++) {
                int resi = nume % i;
                if (resi == 0) {
                    resu = false;
                            break;
                }
            }
            return false;
        
    }
}
