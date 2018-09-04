/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehs.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sehs.Database.AccesoDB;
import sehs.entity.ClienteTO;
import uni.util.Session;

/**
 *
 * @author SEHS - TI
 */
public class ClienteDao {
    Connection cn;
    CallableStatement cs;
    ResultSet rs;
    String usp;

    public boolean valida(String usuario, String clave) throws Exception {
        boolean sw = false;

        try {
            cn = AccesoDB.conectabd();

            String sql = "select * from basic.clave where usuario=? and clave=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            if (rs.next()) {
                ClienteTO cliente = new ClienteTO(rs.getString(1), rs.getString(2));
                Session.put("usuario", cliente);//guardamos en la coleccion map con la clave usuario
                sw = true;
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            try {
                cn.close();
            } catch (SQLException e2) {
            }
        }
        return sw;
    }
}
