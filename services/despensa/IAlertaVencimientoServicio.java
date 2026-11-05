import java.util.List;

public interface IAlertaVencimientoServicio {

    AlertaVencimiento crear (AlertaVencimiento alertaVencimiento);
    AlertaVencimiento buscarPorId (Long id);
    List<AlertaVencimiento> listarTodos();
    AlertaVencimiento actualizar (Long id, AlertaVencimiento alertaVencimiento);
    boolean eliminar (Long id);
    List<AlertaVencimiento> listarPorIdItem(Long idItemDespensa);
}
