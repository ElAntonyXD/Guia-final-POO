public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioAunual;

    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, double salarioAnual) {
        super(nombre, numeroIdentificacion);
        this.salarioAunual = salarioAnual;

    }

    @Override
    public double calcularSalario() {
        return salarioAunual / 12;

    }

}
