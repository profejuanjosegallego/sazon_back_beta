import java.util.List;

import models.nutricion.InformacionNutricional;

public interface IInformaciónNutricionalServicio {
    InformacionNutricional crear (InformacionNutricional informacionNutricional);
    InformacionNutricional buscarPorId (Long id);
    List<InformacionNutricional> listarTodos();
    InformacionNutricional actualizar(Long id, InformacionNutricional informacionNutricional);
    boolean eliminar(Long id);
    List<InformacionNutricional> listarPorIdProducto(Long idProducto);
}
