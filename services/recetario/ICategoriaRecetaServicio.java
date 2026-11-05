public interface ICategoríaRecetaServicio {

    CategoríaReceta crear(CategoríaReceta categoríaReceta);
    CategoríaReceta buscarPorId(Long id);
    List<CategoríaReceta> listarTodos();
    CategoríaReceta actualizar(Long id, CategoríaReceta categoríaReceta);
    boolean eliminar(Long id);
    List<CategoríaReceta> listarPorIdUsuarioCreador(Long idUsuarioCreador);

}
