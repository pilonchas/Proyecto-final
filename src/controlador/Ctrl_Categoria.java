package controlador;

import conexion.conexion;
import java.sql.PreparedStatement;
import modelo.Categoria;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author FERNANDO
 */
public class Ctrl_Categoria {

    //este metodo es para registar categoria
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("Insert into tb_categoria values(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
        return respuesta;
    }

    // metodo para consultar si existe categoria
    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;

        String sql = "select descripcion  from tb_categoria where descripcion ='" + categoria + "';";
        Statement st;

        try {

            Connection cn = conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar " + e);
        }
        return respuesta;
    }
//este metodo es para actualizar categoria
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(" Update tb_categoria set descripcion=? where idcategoria = '"+ idCategoria+"'");
            consulta.setString(1, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar" + e);
        }
        return respuesta;
    }
    
    //metodo para eliminar  una nueva categoria
    public boolean eliminar( int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("  delete from tb_categoria where idcategoria = '"+ idCategoria+"'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar" + e);
        }
        return respuesta;
    }

}
