package models.catalogo;

public class ImagenProducto {

    private long id;
    private String url;
    private String textoAletarnativo;
    private Boolean esPrincipal;
    private Integer orden;
    private long idProducto;

    public ImagenProducto() {
    }

    public ImagenProducto(long id, String url, String textoAletarnativo, Boolean esPrincipal, Integer orden,
            long idProducto) {
        this.id = id;
        this.url = url;
        this.textoAletarnativo = textoAletarnativo;
        this.esPrincipal = esPrincipal;
        this.orden = orden;
        this.idProducto = idProducto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTextoAletarnativo() {
        return textoAletarnativo;
    }

    public void setTextoAletarnativo(String textoAletarnativo) {
        this.textoAletarnativo = textoAletarnativo;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "ImagenProducto [id=" + id + ", url=" + url + ", textoAletarnativo=" + textoAletarnativo
                + ", esPrincipal=" + esPrincipal + ", orden=" + orden + ", idProducto=" + idProducto + "]";
    }


    

}
