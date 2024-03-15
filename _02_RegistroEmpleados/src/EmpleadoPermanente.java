import java.util.ArrayList;

public class EmpleadoPermanente extends Empleado {

    private ArrayList<EmpleadoPermanente> empleadopermanente;

    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad, idEmpleado, salario);
        this.empleadopermanente = new ArrayList<>();
    }

    public ArrayList<EmpleadoPermanente> getEmpleadopermanente() {
        return empleadopermanente;
    }

    public void setEmpleadopermanente(ArrayList<EmpleadoPermanente> empleadopermanente) {
        this.empleadopermanente = empleadopermanente;
    }
}
