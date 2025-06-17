package practica3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cedula, direccion;

        Scanner sc = new Scanner(System.in);

        System.out.println("ESTUDIANTE");
        Estudiante es1= new Estudiante("Juan","Desarrollo",3);

        es1.mostrarInfo();

        System.out.println("Ingrese la cedula del estudiante: ");
        cedula = sc.next();
        System.out.println("Ingrese la direccion del estudiante: ");
        direccion = sc.next();

        es1.setDireccion(direccion);
        es1.setCedula(cedula);
        es1.mostrarInfo();

        System.out.println(""); //Salto de linea

        System.out.println("DOCENTE");
        Docente d1 = new Docente("Pedro",5);

        d1.mostrarInfo();

        System.out.println("Ingrese la cedula del docente: ");
        cedula = sc.next();
        System.out.println("Ingrese la direccion del docente: ");
        direccion = sc.next();

        d1.setDireccion(direccion);
        d1.setCedula(cedula);
        d1.mostrarInfo();

    }
}
