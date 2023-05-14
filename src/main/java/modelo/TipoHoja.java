package modelo;

import java.io.Serializable;

public class TipoHoja implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int id_hoja;
    private String tipoh,descripcion;

    public TipoHoja(){}

    public TipoHoja(int id_hoja, String tipoh, String descripcion) {
        this.id_hoja = id_hoja;
        this.tipoh = tipoh;
        this.descripcion = descripcion;
    }

    public int getId_hoja() {
        return id_hoja;
    }

    public void setId_hoja(int id_hoja) {
        this.id_hoja = id_hoja;
    }

    public String getTipoh() {
        return tipoh;
    }

    public void setTipoh(String tipoh) {
        this.tipoh = tipoh;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
