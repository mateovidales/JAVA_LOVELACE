import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // Instancias
        Scanner scanner = new Scanner(System.in);
        GestionCurso gestion = new GestionCurso();

        int opcion = 0;
        do {
            System.out.println("""
                    MENU DE OPCIONES
                    1. Administrar Estudiantes
                    2. Administrar Cursos
                    3. Salir
                    
                    Ingrese una opcion:          
                       """);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int opcion3 = 0;
                    do {
                        System.out.println("""
                                MENU ESTUDIANTE
                                1. Agregar estudiante al curso
                                2. Listar todos los estudiantes de un curso
                                3.eliminar estudiante de un curso
                                4.salir
                                Ingrese una opcion
                                """);
                        opcion3 = scanner.nextInt();
                        switch (opcion3){
                            case 1:
                                gestion.listarTodosLosCursos();
                                System.out.println("Ingresa el codigo del curso donde ingresaras el nuevo estudiantr");
                                String codigo = scanner.next();

                                Curso objCurso = gestion.buscarCursoPorCodigo(codigo);
                                if(objCurso == null){
                                    System.out.println("El codigo ingresado no es valido");
                                }else {
                                    objCurso.agregarEstudiante(scanner);
                                    System.out.println("El curso fue agregado correctamente");
                                }
                                break;
                            case 2:
                                gestion.listarTodosLosCursos();
                                System.out.println("Ingresa el codigo del curso donde ingresaras el nuevo estudiantr");
                                codigo = scanner.next();

                                objCurso = gestion.buscarCursoPorCodigo(codigo);
                                if(objCurso == null){
                                    System.out.println("El codigo ingresado no es valido");
                                }else {
                                    objCurso.listarEstudiantes();
                                    System.out.println("El curso fue agregado correctamente");
                                }
                                break;
                            case 3: //eliminar estudiantes de un curso
                                //1 listar los cursos
                                gestion.listarTodosLosCursos();
                                //2 preguntar el codigo del curso
                                System.out.println("Ingresa el codigo del curso donde deseas eliminar el estudiante");
                                codigo =scanner.next();
                                //3 buscar el curso que tenga ese coodigo
                                Curso objcurso = gestion.buscarCursoPorCodigo(codigo);
                                if (objcurso == null){
                                    System.out.println("El codigo ingresado no coincide con ningun curso");
                                }else {
                                    objcurso.eliminarEstudiantes(scanner);
                                }
                                //4 eliminar el estudiante de ese curso encontrado

                                break;
                        }
                    }while (opcion != 4);
                case 2:
                    int opcion2 = 0;
                    do {
                        System.out.println("""
                                MENU DE CURSOS
                                1. Agregar curso
                                2. Listar curso
                                3. Buscar por codigo
                                4. Salir
                                """);
                        opcion2 = scanner.nextInt();
                        switch (opcion2){
                            case 1:
                                gestion.agregarCurso(scanner);
                                break;
                            case 2:
                                gestion.listarTodosLosCursos();
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del curso a buscar: ");
                                String codigo = scanner.next();

                                Curso objCurso = gestion.buscarCursoPorCodigo(codigo);
                                if (objCurso== null){
                                    System.out.println("No existe ningun curso con este codigo");
                                }else {
                                    System.out.println(objCurso.toString());
                                }

                        }

                    }while (opcion2 != 4);
                    break;
            }
        }while (opcion != 3);
    }
}