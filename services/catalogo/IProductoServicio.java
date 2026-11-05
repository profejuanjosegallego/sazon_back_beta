import java.util.list;

public interface IProductoServicio {

    Producto crear (Producto producto);
    Producto buscarPorId (long id);
    List<Producto> listartodos();
    Producto actualizar (Lond id, Producto producto);
    boolean eliminar (Long id);
    List<Producto> listaePorIdMarca (Long idMarca);

}
