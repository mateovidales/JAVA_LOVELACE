import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    private static int index = 1;
    public Curso(String codigo, String nombre){
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Scanner objScan){
        objScan.nextLine();
        System.out.println("Ingrese el nombre del nuevo estudiantes:");
        String nombre = objScan.nextLine();
        System.out.println("Ingrese el email del nuevo estudiantes:");
        String email = objScan.nextLine();

        Estudiante objEstudiante = new Estudiante(index, nombre,email);
        index++;

        this.listaEstudiantes.add(objEstudiante);
        System.out.println("Estudiante agregado correctamente");
    }

    public void listarEstudiantes(){
        if (this.listaEstudiantes.isEmpty()){
            System.out.println("No hay estudiantes en el curso ".concat(this.nombre));
        }else {
            System.out.println("lista de estudiantes del curso ".concat(this.nombre));
            for (Estudiante i: this.listaEstudiantes){
                System.out.println(i.toString());
            }
        }

    }

    public void eliminarEstudiantes(Scanner objScan){
        this.listarEstudiantes();
        System.out.println("Ingrese el id del estudiante que quiere eliminar");
        int idEliminar = objScan.nextInt();
        boolean eliminado = this.listaEstudiantes.removeIf(estudiante -> estudiante.getId()==idEliminar);
            System.out.println(!eliminado
                    ?"No se pudo eliminar el estudiante"
                    :"el estudiante fue eliminado correctamente");
        }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
