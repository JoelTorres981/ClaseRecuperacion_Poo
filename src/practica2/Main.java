package practica2;

public class Main {
    public static void main(String[] args) {
        Departamento dep1 = new Departamento("Quitumbe","17-jun-2025",1010,"500 metros cuadrados");
        Casa casa1= new Casa("Solanda","16-jun-2025",1009,3);

        dep1.mostrarInfo();
        casa1.mostrarInfo();

    }
}
