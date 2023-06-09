/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_4_listaenlasala;

/**
 *
 * @author W11
 */
public class EVA2_4_ListaEnlazada {

	public static void main(String[] args) {
        Lista list = new Lista();

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
        }

        System.out.println(list.toString());
        System.out.println(list.getSize());
//        list.empty();
//        System.out.println(list.toString());
//        System.out.println(list.getSize());

        try {
            list.addAt(5000, 2);
            System.out.println(list.toString());
            System.out.println(list.getSize());
            list.deleteAt(2);
            System.out.println(list.toString());
            System.out.println(list.getSize());

            System.out.println(String.format("La posición de %s es: %s", 5000, list.findValuePos(5000)));
            System.out.println(list.toString2());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}