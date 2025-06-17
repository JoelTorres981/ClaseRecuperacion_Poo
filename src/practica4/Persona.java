package practica4;

public class Persona {
    private static int edad=10;

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        if (edad >= 0){
            System.out.println("Edad guardada: "+edad);
        } else {
            System.out.println("Error: Edad invalida, no actualizada");
            System.out.println("Edad aceptada: "+getEdad());
        }
    }
}
