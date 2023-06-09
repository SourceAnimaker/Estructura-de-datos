/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_capturas;

import java.util.Scanner;

/**
 *
 * @author W11
 */
public class EVA1_13_CAPTURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int arreCalifas[][][];
            Scanner input = new Scanner(System.in);
            System.out.println("Cuantos grupos existen?");
            int grupos = input.nextInt();
            arreCalifas = new int [grupos][][];

            for (int i = 0; i < arreCalifas.length; i++) {
            System.out.println("Cuantos alumnos tiene el grupo " + i);
            int noAlumnos = input.nextInt();
            arreCalifas[i] = new int [noAlumnos][];
                for (int j = 0; j < arreCalifas.length; j++) {
                System.out.println("Cuantas materias tiene el alumno? " + j);
                int noMaterias = input.nextInt();
                arreCalifas[i][j] = new int [noMaterias];
                    for (int k = 0; k < arreCalifas[i][j].length; k++) {
                    System.out.println("Calificacion de materia? " + k);
                    int califa = input.nextInt();
                    arreCalifas[i][j][k] = califa;
                    }
                }
            }
            for (int i = 0; i < arreCalifas.length; i++) {
                System.out.println("GRUPO" + i);
                for (int j = 0; j < arreCalifas[i].length; j++) {
                    System.out.print("Estudiante" + j + ": ");
                    for (int k = 0; k < arreCalifas[i][j].length; k++) {
                        System.out.print("[" + arreCalifas[i][j][k] + "]");
                    }
                    System.out.println();
                }
            }
        }
    }
