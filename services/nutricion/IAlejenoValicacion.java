import java.util.List;

public interface IAlejenoValicacion {

    Alerjeno crear (Alerjeno alerjeno);
    Alerjeno buscarPorId (long id);
    List<Alerjeno> listarTodos();
    Alerjeno actualizar (long id, Alerjeno alerjeno);
    boolean eliminar (long id);
    List<Alerjeno> listarPorIdUsuarioCreador(long idUsuarioCreador);

}
