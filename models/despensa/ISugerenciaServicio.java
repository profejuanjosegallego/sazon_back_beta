import java.util.List;

public interface ISugerenciaServicio {

    
    Sugerencia crear(Sugerencia sugerencia);
    Sugerencia buscarPorId(Long id);
    List<Sugerencia> listarTodos();
    Sugerencia actualizar (Long id, Sugerencia sugerencia);
    boolean eliminar(Long id);
    List <Sugerencia> listarPorIdDespensa(Long idDespensa);
    
}
