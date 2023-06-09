package modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int  id_usuario;
    private String nombre, apellido, correo;
    private String id_usuarioN;
    public Usuario(){}
    public Usuario(int id_usuario, String nombre, String apellido, String correo,String id_usuarioN) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.id_usuarioN =id_usuarioN;
    }
    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }


    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getId_usuarioN() {
        return id_usuarioN;
    }

    public void setId_usuarioN(String id_usuarioN) {
        this.id_usuarioN = id_usuarioN;
    }
}
