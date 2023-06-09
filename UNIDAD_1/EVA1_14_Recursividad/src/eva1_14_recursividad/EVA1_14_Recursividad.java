/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_recursividad;

/**
 *
 * @author W11
 */
public class EVA1_14_Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //recusrivo();
        /*for (int i = 10; i >= 1; i--); {
        System.out.println(i + " - ");
    }*/
        falsoFor(10);
        System.out.println("");
    }
    public static void falsoFor(int valor) {
        System.out.println(valor + " - ");
        if(valor > 1)
        falsoFor(valor - 1);
    }
    public static void falsoForUp (int ini, int valor){
        System.out.print(ini + " - ");
        if(ini < valor)
            falsoForUp(ini + 1, valor);
    }
    /*public static void recusrivo(){
        System.out.println("Hola Stackoverflows!!");
        recusrivo();*/
}
