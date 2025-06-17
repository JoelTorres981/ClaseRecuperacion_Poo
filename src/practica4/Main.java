package practica4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una edad: ");
        edad = sc.nextInt();
        Persona.setEdad(edad);
    }
}
