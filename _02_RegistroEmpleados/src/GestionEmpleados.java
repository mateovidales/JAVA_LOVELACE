import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Empleado> ListaEmpleados;

    public GestionEmpleados() {
        this.ListaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        ListaEmpleados.add(empleado);
    }

    public boolean EliminarEmpleado(int idEmpleado) {
        return this.ListaEmpleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
    }
        public void mostrarEmpleados(){
            for (Empleado empleado : ListaEmpleados) {
                System.out.println(empleado.toString());
            }
        }
    }


