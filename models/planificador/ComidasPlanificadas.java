package models.planificador;

public class ComidasPlanificadas {
    private String diaSemana;
    private String tipoComida;
    private Integer porciones;
    private Long id;
    private Long idReceta;
    private Long idPlanSemanal;
    public ComidasPlanificadas() {
    }
    public ComidasPlanificadas(String diaSemana, String tipoComida, Integer porciones, Long id, Long idReceta,
            Long idPlanSemanal) {
        this.diaSemana = diaSemana;
        this.tipoComida = tipoComida;
        this.porciones = porciones;
        this.id = id;
        this.idReceta = idReceta;
        this.idPlanSemanal = idPlanSemanal;
    }
    public String getDiaSemana() {
        return diaSemana;
    }
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
    public String getTipoComida() {
        return tipoComida;
    }
    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
    public Integer getPorciones() {
        return porciones;
    }
    public void setPorciones(Integer porciones) {
        this.porciones = porciones;
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
    public Long getIdPlanSemanal() {
        return idPlanSemanal;
    }
    public void setIdPlanSemanal(Long idPlanSemanal) {
        this.idPlanSemanal = idPlanSemanal;
    }
    @Override
    public String toString() {
        return "ComidasPlanificadas [diaSemana=" + diaSemana + ", tipoComida=" + tipoComida + ", porciones=" + porciones
                + ", id=" + id + ", idReceta=" + idReceta + ", idPlanSemanal=" + idPlanSemanal + "]";
    }
}
