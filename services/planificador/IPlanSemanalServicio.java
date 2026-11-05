public interface IPlanSemanalServicio {
    PlanSemanal crear (PlanSemanal planSemanal);
    PlanSemanal buscarPorId (Long id);
    List <PlanSemanal> listarTodos();
    PlanSemanal actualizar(Long id, PlanSemanal planSemanal);
    boolean eliminar (Long id);
    List <PlanSemanal> listarPorIdUsuario(Long idUsuario);
}
