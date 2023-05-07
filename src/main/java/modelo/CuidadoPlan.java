package modelo;

import java.io.Serializable;

public class CuidadoPlan implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int id_cuidado;
    private String descripcion;
    private int tipofk;
    public CuidadoPlan(){}

    public CuidadoPlan(int id_cuidado, String descripcion, int tipofk) {
        this.id_cuidado = id_cuidado;
        this.descripcion = descripcion;
        this.tipofk = tipofk;
    }

    public int getId_cuidado() {
        return id_cuidado;
    }

    public void setId_cuidado(int id_cuidado) {
        this.id_cuidado = id_cuidado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipofk() {
        return tipofk;
    }

    public void setTipofk(int tipofk) {
        this.tipofk = tipofk;
    }
}
