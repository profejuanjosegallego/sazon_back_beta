package models.comunidad;

import java.util.ArrayList;
import java.util.List;

public class Colecciones {

    // Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private List<String> elementos;



    
    // Constructor vacío
    public Colecciones() {
        this.elementos = new ArrayList<>();
    }

    // Constructor completo
    public Colecciones(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion; 
        this.elementos = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getElementos() {
        return elementos;
    }

    public void setElementos(List<String> elementos) {
        this.elementos = elementos;
    }

    // Agregar elementos a la colección
    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    // Eliminar elementos de la colección
    public void eliminarElemento(String elemento) {
        elementos.remove(elemento);
    }

    // Mostrar información
    @Override
    public String toString() {
        return "Colecciones{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", elementos=" + elementos +
                '}';
    }
}
  

