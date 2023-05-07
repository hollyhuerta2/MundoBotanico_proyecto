package modelo;

import java.io.Serializable;

public class Plantas implements Serializable {
    private int id_planta;
    private String nombre_com, nombre_cient;
    private int tipofk, zonafk, familiafk;

    public Plantas(){}

    public Plantas(int id_planta, String nombre_com, String nombre_cient, int tipofk, int zonafk, int familiafk) {
        this.id_planta = id_planta;
        this.nombre_com = nombre_com;
        this.nombre_cient = nombre_cient;
        this.tipofk = tipofk;
        this.zonafk = zonafk;
        this.familiafk = familiafk;
    }

    public int getId_planta() {
        return id_planta;
    }

    public void setId_planta(int id_planta) {
        this.id_planta = id_planta;
    }

    public String getNombre_com() {
        return nombre_com;
    }

    public void setNombre_com(String nombre_com) {
        this.nombre_com = nombre_com;
    }

    public String getNombre_cient() {
        return nombre_cient;
    }

    public void setNombre_cient(String nombre_cient) {
        this.nombre_cient = nombre_cient;
    }

    public int getTipofk() {
        return tipofk;
    }

    public void setTipofk(int tipofk) {
        this.tipofk = tipofk;
    }

    public int getZonafk() {
        return zonafk;
    }

    public void setZonafk(int zonafk) {
        this.zonafk = zonafk;
    }

    public int getFamiliafk() {
        return familiafk;
    }

    public void setFamiliafk(int familiafk) {
        this.familiafk = familiafk;
    }
}
