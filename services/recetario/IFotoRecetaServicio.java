package services.recetario;

import java.util.List;

public interface IFotoRecetaServicio {
    FotoReceta crear(FotoReceta fotoReceta);
    FotoReceta buscarPorId(Long id);
    List<FotoReceta> listartodos();
    FotoReceta modificar(long id, FotoReceta fotoReceta);
    boolean eliminar(long id);
    List<FotoReceta> listarPorIdReceta(long idReceta);

}
