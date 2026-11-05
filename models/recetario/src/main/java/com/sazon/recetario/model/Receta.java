package com.sazon.recetario.model;

public class Receta {
    
private Long id;
private String título;
private String descripción;
private Integer tiempoPreparaciónMin;
private Integer porciones;
private Long idCategoríaReceta;
private Long idUsuarioAutor;


    public Receta() {
}


    public Receta(Long id, String título, String descripción, Integer tiempoPreparaciónMin, Integer porciones,
            Long idCategoríaReceta, Long idUsuarioAutor) {
        this.id = id;
        this.título = título;
        this.descripción = descripción;
        this.tiempoPreparaciónMin = tiempoPreparaciónMin;
        this.porciones = porciones;
        this.idCategoríaReceta = idCategoríaReceta;
        this.idUsuarioAutor = idUsuarioAutor;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTítulo() {
        return título;
    }


    public void setTítulo(String título) {
        this.título = título;
    }


    public String getDescripción() {
        return descripción;
    }


    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }


    public Integer getTiempoPreparaciónMin() {
        return tiempoPreparaciónMin;
    }


    public void setTiempoPreparaciónMin(Integer tiempoPreparaciónMin) {
        this.tiempoPreparaciónMin = tiempoPreparaciónMin;
    }


    public Integer getPorciones() {
        return porciones;
    }


    public void setPorciones(Integer porciones) {
        this.porciones = porciones;
    }


    public Long getIdCategoríaReceta() {
        return idCategoríaReceta;
    }


    public void setIdCategoríaReceta(Long idCategoríaReceta) {
        this.idCategoríaReceta = idCategoríaReceta;
    }


    public Long getIdUsuarioAutor() {
        return idUsuarioAutor;
    }


    public void setIdUsuarioAutor(Long idUsuarioAutor) {
        this.idUsuarioAutor = idUsuarioAutor;
    }


    @Override
    public String toString() {
        return "Receta []";
    }
    
}
