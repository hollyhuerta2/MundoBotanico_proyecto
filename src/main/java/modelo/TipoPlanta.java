package modelo;

import java.io.Serializable;

public class TipoPlanta implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int id_tipo;
    private String tipo,descripcion;
    public TipoPlanta(){}
    public TipoPlanta(int id_tipo, String tipo, String descripcion) {
        this.id_tipo = id_tipo;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    public int getId_tipo() {
        return id_tipo;
    }
    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
