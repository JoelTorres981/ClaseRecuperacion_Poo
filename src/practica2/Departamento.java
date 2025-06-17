package practica2;

public class Departamento extends Inmobiliaria{
    protected String tamaño;
    public Departamento(String direccion, String fecha, int codigo, String tamaño) {
        super(direccion, fecha, codigo);
        this.tamaño = tamaño;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño del lugar: "+tamaño+"\n");
    }
}
