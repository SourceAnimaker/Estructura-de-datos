/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_3_nodos;

/**
 *
 * @author W11
 */
public class EVA_2_3_Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nodo = new Nodo();
        nodo.valor = 100;
        nodo.sig = new Nodo();
        nodo.sig.valor = 200;
        nodo.sig.sig = new Nodo();
        nodo.sig.sig.valor = 300;
        /*System.out.print("[" + nodo.valor + "]");
        System.out.print("[" + nodo.sig.valor + "]");
        System.out.print("[" + nodo.sig.sig.valor + "]");*/
        Nodo temp = nodo;
        while(temp != null){
            System.out.print("[" + nodo.valor + "]");
            temp = temp.sig;
        }
    }
    
}
class Nodo {
    public int valor;
    public Nodo sig;
    
    public Nodo(){
        sig = null;
    }
}