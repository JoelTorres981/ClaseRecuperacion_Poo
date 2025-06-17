package practica3;

public class Estudiante extends Persona{
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String carrera, int semestre) {
        super(nombre);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Semestre: " + getSemestre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Direccion: " + getDireccion());
    }
}
