import java.util.List;

public interface IPresentaciónServicio {

    Presentacion crear (Presentacion presentacion);
    Presentacion buscarPorId (Long id);
    List<Presentacion> listarTodos();
    Presentacion actulizar(Long id, Presentacion presentacion);
    boolean eliminar(Long id);
    List<Presentacion> ListarPorIdUsuarioCreador(Long idUsuarioCreador);

}
