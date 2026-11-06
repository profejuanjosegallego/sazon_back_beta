public interface IRecompensaServicio {

    recompensa crear (recompensa recompensa);
    recompensa buscarPorId (long id);
    list<recompensa> listarTodos();
    recompensa actualizar(long id, recompensa recompensa);
    boolean eliminar(long id);
    list<recompensa> listarPorIdCampaña(long idCampaña);
    
}
