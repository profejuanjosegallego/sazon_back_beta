import java.util.List;

public interface IMarcaServicio {

    Marcas crear (Marcas marca);
    Marcas buscarPorId (Long id);
    List<Marcas> listarTodos();
    Marcas actualizar(Long id, Marcas marca);
    boolean eliminar(Long id);
    List<Marcas> ListarPorIdUsuarioCreador (Long idUsuarioCreador);

}
