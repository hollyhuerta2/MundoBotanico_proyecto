package modelo;

import java.io.Serializable;

public class Familia implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int id_fam;
    private String nombre, descripcion;

    public Familia(){}

    public Familia(int id_fam, String nombre, String descripcion) {
        this.id_fam = id_fam;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public int getId_fam() {
        return id_fam;
    }
    public void setId_fam(int id_fam) {
        this.id_fam = id_fam;
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
}
