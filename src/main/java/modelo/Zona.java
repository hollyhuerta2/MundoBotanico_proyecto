package modelo;

import java.io.Serializable;

public class Zona implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int id_zona;
    private String zona,area_geo;
    public Zona(){}

    public Zona(int id_zona, String zona, String area_geo) {
        this.id_zona = id_zona;
        this.zona = zona;
        this.area_geo = area_geo;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getArea_geo() {
        return area_geo;
    }

    public void setArea_geo(String area_geo) {
        this.area_geo = area_geo;
    }
}
