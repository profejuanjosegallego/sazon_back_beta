import java.util.List;

public interface IRecetaServicio {

    Receta crear (Receta receta);
    Receta buscarPorId(Long id);
    List<Receta> listarTodos();
    Receta actualizar(Long id, Receta receta);
    boolean eliminar(Long id);
    List<Receta> listarPorIdCategoríaReceta(Long idCategoríaReceta);

}
