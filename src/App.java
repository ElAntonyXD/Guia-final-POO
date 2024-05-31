public class App {
    public static void main(String[] args) throws Exception {
        
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Roberto Camada", "4512", 120000.0);
        empleados[1] = new EmpleadoMedioTiempo("Sheyla Rodriguez", "4598", 22.0, 25);

        for (Empleado empleado : empleados){
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: $" + empleado.calcularSalario());

        }
    }
}
