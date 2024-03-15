import java.util.ArrayList;

public class Inventario {
    private ArrayList<ProductoEspecifico> ListaProductos;

    public Inventario(){
        this.ListaProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoEspecifico producto){
        this.ListaProductos.add(producto);
    }

    public boolean eliminarProducto(int id){
        return this.ListaProductos.removeIf(producto -> producto.getId() == id);

    }

    public void listarProductos(){
        for(ProductoEspecifico iterador: this.ListaProductos){
            System.out.println((iterador.toString()));
        }
    }

    public ProductoEspecifico buscarPorNombre(String nombreBuscar){
        for(ProductoEspecifico i : this.ListaProductos){
            if (i.getNombre().equalsIgnoreCase(nombreBuscar)){
                return i;
            }
        }
        return null;
    }

    public ProductoEspecifico buscarPorCategoria(String categoriaBuscar){
        for (ProductoEspecifico i: this.ListaProductos){
        if (i.getCategoria().equalsIgnoreCase(categoriaBuscar)){
            return i;
        }
        }
        return null;
    }




}
