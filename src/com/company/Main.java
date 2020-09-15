package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        DirectorioTelefonico directorioTelefonico = new DirectorioTelefonico();

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
                        System.out.println("Ingrese si es Docente (1) o Personal Administrativo (2): ");
                        switch (sc.nextLine()) {
                            case "1":
                                System.out.print("Ingrese si es Instructor (1), Jefe de Practica (2) o Profesor (3): ");
                                switch (sc.nextLine()) {
                                    case "1":
                                        Instructor u = new Instructor();
                                        System.out.print("Ingrese Ciclo actual (del 1 al 12): ");
                                        u.setCicloActual((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese cantidad de cursos que supervisa: ");
                                        u.setCantidadCursos((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese año de inicio: ");
                                        u.setAnioInicio((Integer.parseInt(sc.nextLine())));
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
                                        directorioTelefonico.getListaUsuarios().add(u);
                                        break;
                                    case "2":
                                        JefeDePractica jefeDePractica = new JefeDePractica();
                                        System.out.print("Ingrese año de egreso: ");
                                        jefeDePractica.setAnioEgreso((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese cantidad de cursos que supervisa: ");
                                        jefeDePractica.setCantidadCursos((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese año de inicio: ");
                                        jefeDePractica.setAnioInicio((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese Código PUCP: ");
                                        jefeDePractica.setCodigoPucp((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese nombre: ");
                                        jefeDePractica.setNombres(sc.nextLine());
                                        System.out.print("Ingrese apellido: ");
                                        jefeDePractica.setApellido(sc.nextLine());
                                        System.out.print("Ingrese telefono: ");
                                        jefeDePractica.setTelefono(Integer.parseInt(sc.nextLine()));
                                        System.out.print("Ingrese anexo: ");
                                        jefeDePractica.setAnexo(Integer.parseInt(sc.nextLine()));
                                        System.out.print("Ingrese departamento: ");
                                        jefeDePractica.setDepartamento(sc.nextLine());
                                        directorioTelefonico.getListaUsuarios().add(jefeDePractica);
                                    case "3":
                                        Profesor p = new Profesor();
                                        System.out.print("Facultad que dicta: ");
                                        p.setFacultad(sc.nextLine());
                                        System.out.print("Ingrese cantidad de cursos que supervisa: ");
                                        p.setCantidadCursos((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese año de inicio: ");
                                        p.setAnioInicio((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese Código PUCP: ");
                                        p.setCodigoPucp((Integer.parseInt(sc.nextLine())));
                                        System.out.print("Ingrese nombre: ");
                                        p.setNombres(sc.nextLine());
                                        System.out.print("Ingrese apellido: ");
                                        p.setApellido(sc.nextLine());
                                        System.out.print("Ingrese telefono: ");
                                        p.setTelefono(Integer.parseInt(sc.nextLine()));
                                        System.out.print("Ingrese anexo: ");
                                        p.setAnexo(Integer.parseInt(sc.nextLine()));
                                        System.out.print("Ingrese departamento: ");
                                        p.setDepartamento(sc.nextLine());
                                        directorioTelefonico.getListaUsuarios().add(p);
                                        break;
                                }
                            case "2":
                                PersonalAdministrativo p = new PersonalAdministrativo();
                                System.out.print("Cargo que desempeña: ");
                                p.setCargo(sc.nextLine());
                                System.out.print("Ingrese Código PUCP: ");
                                p.setCodigoPucp((Integer.parseInt(sc.nextLine())));
                                System.out.print("Ingrese nombre: ");
                                p.setNombres(sc.nextLine());
                                System.out.print("Ingrese apellido: ");
                                p.setApellido(sc.nextLine());
                                System.out.print("Ingrese telefono: ");
                                p.setTelefono(Integer.parseInt(sc.nextLine()));
                                System.out.print("Ingrese anexo: ");
                                p.setAnexo(Integer.parseInt(sc.nextLine()));
                                System.out.print("Ingrese departamento: ");
                                p.setDepartamento(sc.nextLine());
                                directorioTelefonico.getListaUsuarios().add(p);
                                break;
                        }

                    case "3":
                        break;
                    case "4":
                        System.out.print("Buscar en directorio: ");
                        break;
                    default:
                        System.out.print("Opcion errada!");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.print("Ingrese un numero!");
                break;


            }
        }
    }
}
