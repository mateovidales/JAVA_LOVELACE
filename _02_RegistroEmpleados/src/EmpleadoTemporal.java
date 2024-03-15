import java.util.ArrayList;

public class EmpleadoTemporal extends Empleado{

    private ArrayList<Empleado> empleadotemporal;

    public EmpleadoTemporal(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad, idEmpleado, salario);
        this.empleadotemporal = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleadotemporal() {
        return empleadotemporal;
    }

    public void setEmpleadotemporal(ArrayList<Empleado> empleadotemporal) {
        this.empleadotemporal = empleadotemporal;
    }


}
