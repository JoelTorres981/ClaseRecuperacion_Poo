package practica1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();

        System.out.println("Velocidad inicial del vehiculo: " + vehiculo.getKm());

        vehiculo.setKm(80);
        vehiculo.setPlaca("PCI-1028");

        System.out.println("Velocidad: "+vehiculo.getKm()+"km/h");
        System.out.println("Placa: "+vehiculo.getPlaca());
    }
}
