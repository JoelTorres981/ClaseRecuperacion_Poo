package practica2;

public class Casa extends Inmobiliaria{
    protected int numPisos;

    public Casa(String direccion, String fecha, int codigo, int numPisos) {
        super(direccion, fecha, codigo);
        this.numPisos = numPisos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene "+numPisos + " pisos\n");
    }
}
