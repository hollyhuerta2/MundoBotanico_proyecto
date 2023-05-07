package modelo;

import java.io.Serializable;

public class Planta_Us implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int id_planus;
    private int usuariofk, plantasfk;
    public Planta_Us(){}

    public Planta_Us(int id_planus, int usuariofk, int plantasfk) {
        this.id_planus = id_planus;
        this.usuariofk = usuariofk;
        this.plantasfk = plantasfk;
    }

    public int getId_planus() {
        return id_planus;
    }

    public void setId_planus(int id_planus) {
        this.id_planus = id_planus;
    }

    public int getUsuariofk() {
        return usuariofk;
    }

    public void setUsuariofk(int usuariofk) {
        this.usuariofk = usuariofk;
    }

    public int getPlantasfk() {
        return plantasfk;
    }

    public void setPlantasfk(int plantasfk) {
        this.plantasfk = plantasfk;
    }
}
