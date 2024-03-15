import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionEmpleados gestion = new GestionEmpleados();

        int opcion = 0;
        do {
            System.out.println("""
                    MENU DE OPCIONES 
                    1.Agregar un nuevo empleado
                    2.Eliminar un empleado
                    3.Mostrar todos los empleados
                    4.salir
                    """);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del empleado");
                    String nombre = scanner.next();
                    System.out.println("Ingrese la edad del empleado");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese el id del empleado");
                    int idEmpleado= scanner.nextInt();
                    System.out.println("Ingrese el salario del empleado");
                    double salario = scanner.nextDouble();
                    System.out.println("Tipo de empleado (temporal o permanente");
                    String tipo = scanner.next();
                    if (tipo.equalsIgnoreCase("temporal")){
                        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(nombre,edad,idEmpleado,salario);
                        gestion.agregarEmpleado(empleadoTemporal);
                        System.out.println("El empleado temporal se creo correctamente");
                    }else if (tipo.equalsIgnoreCase("permanente")){
                        EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente(nombre,edad,idEmpleado,salario);
                        gestion.agregarEmpleado(empleadoPermanente);
                    }else {
                        System.out.println("No ingreso el tipo de empleado correctamente");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el id del empleado que desea eliminar");
                    int idEliminarEmpleado = scanner.nextInt();
                    if (gestion.EliminarEmpleado(idEliminarEmpleado)){
                        System.out.println("El empleado se elimino correctamente");
                    }else {
                        System.out.println("No se pudo eliminar el empleado");
                    }
                    break;
                case 3:
                    System.out.println("Estos son los empleados: ");
                    gestion.mostrarEmpleados();
                    break;
            }
        }while (opcion !=4);
    }
}