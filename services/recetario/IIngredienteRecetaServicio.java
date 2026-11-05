public interface IIngredienteRecetaServicio {

    IngredienteReceta crear (IngredienteReceta ingredienteReceta);
    IngredienteReceta buscarporId (Long id);
    List<IngredienteReceta> listartodos();
    IngredienteReceta actualizar (long id, IngredienteReceta ingredienteReceta);
    boolean eliminar (long id);

    list<IngredienteReceta> buscarporReceta (long idReceta);


}
