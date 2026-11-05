import java.util.List;

public interface IImagenProductoServicio {

    ImagenProducto crear (ImagenProducto imagenproducto);
    ImagenProducto buscarPorId(Long id);
    List<ImagenProducto> listarTodos();
    ImagenProducto actualizar(Long id, ImagenProducto imagenproducto);
    boolean eliminar(Long id);
    List<ImagenProducto> listarPorIdProducto(Long idProducto);

}
