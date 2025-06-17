package practica2;

public class Inmobiliaria {
    protected String direccion, fecha;
    protected int codigo;

    public Inmobiliaria(String direccion, String fecha, int codigo) {
        this.direccion = direccion;
        this.fecha = fecha;
        this.codigo = codigo;
    }

    public void mostrarInfo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Fecha: " + fecha);
    }
}
