package com.company;

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
            switch (option) {
                case "1":

                    break;
                case "2":
                    System.out.println("Ingrese si es Docente (1) o Personal Administrativo (2): ");
                    switch (sc.nextLine()) {
                        case "1":
                            System.out.println("Ingrese si es Instructor (1), Jefe de Practica (2) o Profesor (3): ");
                            switch (sc.nextLine()) {
                                case "1":
                                    Instructor u = new Instructor();
                                    System.out.print("Ingrese Ciclo actual (del 1 al 12): ");
                                    u.setCicloActual((Integer.parseInt(sc.nextLine())));
                                    System.out.print("Ingrese Código PUCP: ");
                                    u.setCodigoPucp((Integer.parseInt(sc.nextLine())));
                                    System.out.print("Ingrese nombre: ");
                                    u.setNombres(sc.nextLine());
                                    System.out.print("Ingrese apellido: ");
                                    u.setApellido(sc.nextLine());
                                    System.out.print("Ingrese telefono: ");
                                    u.setTelefono(Integer.parseInt(sc.nextLine()));
                                    System.out.print("Ingrese anexo: ");
                                    u.setAnexo(Integer.parseInt(sc.nextLine()));
                                    System.out.print("Ingrese departamento: ");
                                    u.setDepartamento(sc.nextLine());

                                    break;


                            }

                            break;
                        case "3":

                            break;
                        case "4":

                            break;

                    }

            }
        }
    }
}
