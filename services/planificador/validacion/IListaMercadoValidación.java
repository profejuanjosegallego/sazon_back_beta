package com.sazon.planificador.validacion;

import com.sazon.planificador.modelo.ListaMercado;
import java.time.LocalDate;

public interface IListaMercadoValidación {

    
    boolean validarNombre(String nombre);

   
    boolean validarFechaCreación(LocalDate fechaCreación);

  
    boolean validarPresupuesto(Double presupuesto);

    
    boolean validarCompletada(Boolean completada);

   
    boolean validarIdPlanSemanal(Long idPlanSemanal);

    
    boolean validar(ListaMercado listaMercado);
}