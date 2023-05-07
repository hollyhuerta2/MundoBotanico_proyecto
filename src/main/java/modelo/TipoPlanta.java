package modelo;

import java.io.Serializable;

public class TipoPlanta implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int id_tipo;
    private String tipo, tipo_hoja, altura;
    public TipoPlanta(){}
    public TipoPlanta(int id_tipo, String tipo, String tipo_hoja, String altura) {
        this.id_tipo = id_tipo;
        this.tipo = tipo;
        this.tipo_hoja = tipo_hoja;
        this.altura = altura;
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

    public String getTipo_hoja() {
        return tipo_hoja;
    }

    public void setTipo_hoja(String tipo_hoja) {
        this.tipo_hoja = tipo_hoja;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
