  import java.util.List;  
 import modelo.CuentaFidelización;

public interface ICuentaFidelizaciónServicio {

  

     cuentafidelización crear (Cuentafidelización cuentaFidelización);
     cuentafidelización buscarPorId (Long id);
     Lista<CuentaFidelización> listarTodos();
     cuentafidelización actualizar(Long id, Cuentafidelización cuentaFidelización);
     boolean eliminar(Long id);
     Lista<CuentaFidelización> listarPorIdUsuario(Long idUsuario);
}
