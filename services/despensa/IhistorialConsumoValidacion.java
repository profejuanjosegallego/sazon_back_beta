import java.time.LocalDate;
import models.despensa.HistorialConsumo;


public interface IhistorialConsumoValidacion {

    boolean validarCantidadConsumida(Double cantidadConsumida);
    boolean validarFechaConsumo(LocalDate fechaConsumo);
    boolean validarObservación(String observación);
    boolean validar(HistorialConsumo historialConsumo);

}
