import java.util.List;

public interface IValoracionServivio {

    Valoración crear(Valoración valoración);
    Valoración buscarPorId(Long id);
    List<Valoracion> listarTodos();
    Valoración actualizar(Long id, Valoración valoración);
    boolean eliminar(Long id);
    List<Valoracion> listarPorIdReceta(Long idReceta);
}
