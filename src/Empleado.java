abstract class Empleado {

    public String nombre;
    public String numeroIdentificacion;

    public Empleado(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public abstract double calcularSalario();

}
