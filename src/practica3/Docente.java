package practica3;

public class Docente extends Persona{
    private int numMaterias;

    public Docente(String nombre, int numMaterias) {
        super(nombre);
        this.numMaterias = numMaterias;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Numero de materias a cargo: " + getNumMaterias());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Direccion: " + getDireccion());
    }
}
