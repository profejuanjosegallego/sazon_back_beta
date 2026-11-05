import java.util.List;

import models.despensa.hernan.Despensa;

public interface IDespensaServicio {

    Despensa crear(Despensa despensa);

    Despensa buscarPorId(Long id);

    List<Despensa> listarTodos();

    Despensa actualizar(Long id, Despensa despensa);

    boolean eliminar(Long id);

    List<Despensa> listarPorIdUsuario(Long idUsuario);
}
