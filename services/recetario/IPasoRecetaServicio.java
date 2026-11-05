package services.recetario;

import java.util.List;

import com.sazon.recetario.model.PasoReceta;

public interface IPasoRecetaServicio {

    PasoReceta crear (PasoReceta pasoReceta);
    PasoReceta buscarPorId (Long id);
    List<PasoReceta> listarTodos();
    PasoReceta actualizar(Long id, PasoReceta pasoReceta);
    boolean eliminar(Long id);
    List<PasoReceta> listarPorIdReceta(Long idReceta);

}
