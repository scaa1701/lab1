package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        GestorUsuarios gestorUsuarios = new GestorUsuarios();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Leer Datos");
            System.out.println("2. Agregar Usuario");
            System.out.println("3. Buscar Usuario");
            System.out.println("4. Escribir Directorio");
            System.out.print("Opción: ");
            String option = sc.nextLine();


            try {
                int opcion = Integer.parseInt(option);
                switch (option) {
                    case "1":

                        break;
                    case "2":

                        break;
                    case "3":

                        break;
                    case "4":

                        break;
                    default:
                        System.out.print("Opcion errada!");
                        break;
                }

            }catch (InputMismatchException e){
                   System.out.print("Ingrese un numero!");
                    break;
            }


        }
    }
}
