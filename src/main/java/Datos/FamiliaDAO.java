package Datos;

import Conexion.Conexion;
import modelo.Familia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FamiliaDAO {
    private static final String insertSQL="INSERT INTO FAMILIA(id_fam,nombre,descripcion) VALUES(?,?,?)";
    private static final String updateSQL="UPDATE FAMILIA SET nombre=?,descripcion=? WHERE id_fam=?";

    public List<Familia> ListaFam(){
        Connection conn = null;
        PreparedStatement state =null;
        ResultSet result =null;

        List<Familia> familia= new ArrayList<>();
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement("SELECT *FROM FAMILIA");
            result = state.executeQuery();
            while (result.next()){
                int id_fam = result.getInt("id_fam");
                String nombre = result.getString("nombre");
                String descripcion = result.getString("descripcion");

                Familia fami = new Familia(id_fam,nombre,descripcion);
                familia.add(fami);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(result);
            Conexion.close(state);
            Conexion.close(conn);
        }
        return familia;

    }
    public void agregarFamilia(Familia fam) { //para agregar si es necesario
        Connection conn = null;
        PreparedStatement state = null;
        try{
            conn = Conexion.getConnection();
            state = conn.prepareStatement(insertSQL);

            state.setInt(1,fam.getId_fam());
            state.setString(2, fam.getNombre());
            state.setString(3, fam.getDescripcion());

            state.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
    }
    public int modificarFamilia(Familia familia){ //para modificar si es necesario también
        Connection conn = null;
        PreparedStatement state = null;
        int registros=0;

        try {
            conn = Conexion.getConnection();
            state = conn.prepareStatement(updateSQL);

            state.setString(1,familia.getNombre());
            state.setString(2,familia.getDescripcion());
            state.setInt(3,familia.getId_fam());

            registros = state.executeUpdate();

            if(registros>0) System.out.println("Tu registro de las familias ha sido actualizado");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Conexion.close(state);
            Conexion.close(conn);
        }
        return registros;
    }
}
