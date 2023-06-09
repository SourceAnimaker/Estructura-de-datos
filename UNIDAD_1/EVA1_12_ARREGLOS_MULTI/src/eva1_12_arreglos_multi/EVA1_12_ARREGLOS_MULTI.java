/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_arreglos_multi;

import java.util.Scanner;

/**
 *
 * @author W11
 */
public class EVA1_12_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int arregloMulti [][] =new int [3][];
        // Grupo 1: 40 alumnos
        //arregloMulti[0] = new int [40];
        // Grupo 2: 10 alumnos
        //arregloMulti[1] = new int [10];
        // Grupo 3: 25 alumnos
        //arregloMulti[2] = new int [25];
        //Captura la cantidad de grupos
        // Por cada grupo, captura las calificaciones
        int arreGpos[][];
        Scanner input = new Scanner(System.in);
        //Solicita la cantidad de grupos
        System.out.println("Introduce la cantidad de grupos: ");
        int grupos = input.nextInt();
        arreGpos = new int[grupos][]; //Declarando un arreglo de grupos
        //Llena los datos:
        for (int i = 0; i < arreGpos.length; i++) {
            System.out.println("Grupo " + i);
            System.out.println("Cuantos estudiantes tiene");
            int estu = input.nextInt ();
            arreGpos[i] = new int[estu];
            for (int j = 0; i < arreGpos[i].length; j++) {
                System.out.println("Estudiante " + j);
                System.out.println("Calificacion");
                int califa = input.nextInt ();
                arreGpos[i] = new int[califa];
                }
            }
            for (int i = 0; i < arreGpos.length; i++) {
            for (int j = 0; i < arreGpos[i].length; j++) { 
                System.out.print("[" + arreGpos[i][j] + "]");
            }
            System.out.println();
        }
    } 
}
