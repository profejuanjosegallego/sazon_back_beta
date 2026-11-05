package com.sazon.recetario.model;

public class IngredienteReceta {
    private Long id;
    private Long idReceta;
    private Long idIngrediente;
    private String cantidad;

    public IngredienteReceta() {
    }

    public IngredienteReceta(Long id, Long idReceta, Long idIngrediente, String cantidad) {
        this.id = id;
        this.idReceta = idReceta;
        this.idIngrediente = idIngrediente;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Long idReceta) {
        this.idReceta = idReceta;
    }

    public Long getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Long idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
}
