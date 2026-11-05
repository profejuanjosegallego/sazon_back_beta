import java.util.List;

public interface ICategoriaProductoServicio {

Categoria crear (Categoria categoria);
Categoria buscarPorId (Long id);
list<Categoria> listarTodos();
categoria actualizar(Long id, Categoria categoria);
boolean eliminar(long id);
list<Categoria>  listarPorIdUsuarioCreador(Long idUsuarioCreador);

}
