import java.util.List;

public interface IColecciónServicio {

    Coleccion crear (Coleccion coleccion);
    Coleccion buscarPorId (long id);
    List<Coleccion> ListarTodos();
    Coleccion actualizar (long id, Coleccion coleccion);
    boolean eliminar (Long id);
    List<Categoria> listarPorIdUsuario (Long idUsuarioCreador);

}
