import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario objInventario = new Inventario();
        int opcion = 0;
        do {
            System.out.println("Bienvenido\n" +
                    "1.agregar producto \n" +
                    "2.Eliminar producto \n" +
                    "3.Buscar producto \n" +
                    "4.Buscar por categoria \n" +
                    "5.Listar inventario \n" +
                    "6.Salir");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el id del producto");
                    int id = scanner.nextInt();
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el precio del producto");
                    double precio = scanner.nextDouble();
                    System.out.println("Ingrese la categoria del producto");
                    String categoria = scanner.next();
                    System.out.println("Ingrese la marca del producto");
                    String marca = scanner.next();

                    ProductoEspecifico producto = new ProductoEspecifico(id,nombre,precio,categoria,marca);
                    objInventario.agregarProducto(producto);
                    System.out.println("El producto se agrego correctamente");
                    break;

                case 2:
                    objInventario.listarProductos();
                    System.out.println("Ingrese el ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if (objInventario.eliminarProducto(idEliminar)){
                        System.out.println("El producto se elimino correctamente");
                    }else {
                        System.out.println("No se pudo eliminar el producto");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto que desea buscar");
                    String productoNombre = scanner.next();
                    ProductoEspecifico productoEncontrado =  objInventario.buscarPorNombre(productoNombre);
                    System.out.println(productoEncontrado.toString());
                    break;
                case 4:
                    System.out.println("Ingrese la categoria del producto que desea buscar");
                    String productoCategoria = scanner.next();
                    ProductoEspecifico productoEncontradoCat =  objInventario.buscarPorCategoria(productoCategoria);
                    System.out.println(productoEncontradoCat.toString());
                    break;
                case 5:
                    System.out.println("Esta es la lista de los productos: ");
                    objInventario.listarProductos();
                    break;
            }

        }while (opcion != 6);

    }
}