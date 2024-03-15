import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {
    private ArrayList<Curso> listaCurso;
    public GestionCurso(){
        this.listaCurso = new ArrayList<>();
    }

    public void agregarCurso(Scanner objScan){
        System.out.println("Ingresa el nombre del nuevo curso");
        String nombre = objScan.next();

        System.out.println("Ingresa el codigo del nuevo curso");
        String codigo = objScan.next();
        //Validamos que el codigo del curso sea unico
        if (this.buscarCursoPorCodigo(codigo) != null){
            System.out.println("Ya existe un curso con este codigo 😒");
        }else {
            Curso objCurso = new Curso(codigo,nombre);
           if(this.listaCurso.add(objCurso)){
               System.out.println("Curso agregado correctamente");
           }else {
               System.out.println("no se puede agregar el curso");
           }
        }
    }
    public void listarTodosLosCursos(){
        if (this.listaCurso.isEmpty()){
            System.out.println("No hay cursos registrados");
        }else {
            for (Curso j : this.listaCurso){
                System.out.println("Curso #"+j.toString());
            }
        }
    }
    public Curso buscarCursoPorCodigo(String codigoBuscar){
        for (Curso i : this.listaCurso ){
            if (i.getCodigo().equalsIgnoreCase(codigoBuscar)) {
                return i;
            }
        }
        return null;
    }
}
