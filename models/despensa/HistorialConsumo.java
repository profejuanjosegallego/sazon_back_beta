package models.despensa;

import java.time.LocalDate;

public class HistorialConsumo {

    private Long id;
    private Double cantidadConsumida;
    private LocalDate fechaConsumo;
    private String observacion;
    private Long itemDespensa;


    public HistorialConsumo(Long id, Double cantidadConsumida, LocalDate fechaConsumo, String observacion,
            Long itemDespensa) {
        this.id = id;
        this.cantidadConsumida = cantidadConsumida;
        this.fechaConsumo = fechaConsumo;
        this.observacion = observacion;
        this.itemDespensa = itemDespensa;
    }

    public HistorialConsumo() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCantidadConsumida() {
        return cantidadConsumida;
    }

    public void setCantidadConsumida(Double cantidadConsumida) {
        this.cantidadConsumida = cantidadConsumida;
    }

    public LocalDate getFechaConsumo() {
        return fechaConsumo;
    }

    public void setFechaConsumo(LocalDate fechaConsumo) {
        this.fechaConsumo = fechaConsumo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getItemDespensa() {
        return itemDespensa;
    }

    public void setItemDespensa(Long itemDespensa) {
        this.itemDespensa = itemDespensa;
    }

    @Override
    public String toString() {
        return "HistorialConsumo [id=" + id + ", cantidadConsumida=" + cantidadConsumida + ", fechaConsumo="
                + fechaConsumo + ", observacion=" + observacion + ", itemDespensa=" + itemDespensa + "]";
    }
    
    
}