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
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sehs.Database.AccesoDB;
import static sehs.Database.AccesoDB.conectabd;
import sehs.entity.EmpresaTO;
import sehs.service.ICrudDao;

/**
 *
 * @author SEHS - TI
 */
public class EmpresaDAO implements ICrudDao<EmpresaTO> {

    Connection cn;
    CallableStatement cs;
    ResultSet rs;
    String usp;
    String sql = null;
    Statement stm = null;

    @Override
    public void create(EmpresaTO t) throws Exception {
        try {
            cn = AccesoDB.conectabd();
            //Iniciar transaccion
            cn.setAutoCommit(false);
            usp = "{CALL basic.paempresa_actualizar(?)}";
            //preparar el sp
            cs = cn.prepareCall(usp);
            //preparar los valores de los parametros
            cs.setLong(1, t.getEmpresaid());
            cs.setString(2, t.getNombre());
            cs.setString(3, t.getRuc());
            cs.setString(4, t.getDireccion());
            cs.setString(5, t.getUrl());
            //EJECUTAR EL PA
            cs.executeUpdate();
            cn.commit();
            cs.close();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (SQLException el) {
            }
            throw e;

        } finally {
            try {
                cn.close();
            } catch (SQLException e2) {
            }
        }

    }

    @Override
    public void update(EmpresaTO t) throws Exception {
        try {
            cn = AccesoDB.conectabd();
            //Iniciar transaccion
            cn.setAutoCommit(false);
            usp = "{CALL basic.paempresa_actualizar(?)}";
            //preparar el sp
            cs = cn.prepareCall(usp);
            //preparar los valores de los parametros
            cs.setLong(1, t.getEmpresaid());
            cs.setString(2, t.getNombre());
            cs.setString(3, t.getRuc());
            cs.setString(4, t.getDireccion());
            cs.setString(5, t.getUrl());
            //EJECUTAR EL PA
            cs.executeUpdate();
            cn.commit();
            cs.close();
        } catch (SQLException e) {
            try {
                cn.rollback();
            } catch (SQLException el) {
            }
            throw e;

        } finally {
            try {
                cn.close();
            } catch (SQLException e2) {
            }
        }

    }

    @Override
    public void delete(EmpresaTO t) throws Exception {
        try {
            cn = AccesoDB.conectabd();
            // Iniciar transaccion
            cn.setAutoCommit(false);
            usp = "{? = call basic.paempresa_eliminar(?)}";
            //preparar el sp
            cs = cn.prepareCall(usp);
            //preparar los valores de los parametros
            cs.setLong(1, t.getEmpresaid());
            //ejecutar el sp
            cs.executeUpdate();
            cn.commit(); //confirma que la transaccion se realizo correctamente
            cs.close();
        } catch (SQLException e) {
            try {
                cn.rollback(); // deshace la transaccion (fallo)
            } catch (SQLException e1) {
            }
            throw e;
        } finally {
            try {
                cn.close();
            } catch (SQLException e2) {
            }
        }
    }

    @Override
    public EmpresaTO findForId(EmpresaTO t) throws Exception {
        EmpresaTO emp = null;
        try {
            cn = AccesoDB.conectabd();
            usp = "{? = call basic.paempresa_leer(?, ?)}";
            cs = cn.prepareCall(usp);
            //preparar los valores de los parametros de E/S
             cs.registerOutParameter(1, Types.OTHER);
            cs.setString(2, "'" + t.getNombre()+ "'");
            cs.setString(3, "'" + t.getRuc()+ "'");
           cs.setString(4, "" );
            cs.execute(); // ejecuta el sp
            //convierte el curso en resultset
            rs = (ResultSet) cs.getObject(1);
            if (rs.next()) {
                emp = new EmpresaTO(
                        rs.getLong("empresaid"),
                        rs.getString("nombre"),
                        rs.getString("ruc"),
                        rs.getString("direccion"),
                        rs.getString("url")
                );
            }
            rs.close();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            try {
                cn.close();
            } catch (SQLException e2) {
            }
        }
        return emp;

    }

    @Override
    public List<EmpresaTO> readAll() throws Exception {
        List<EmpresaTO> lista = new ArrayList<>();

//        try {
//            cn = AccesoDB.conectabd();
//            //cn.setAutoCommit(false);
//            usp = "{? = call basic.paempresa_leer(?, ?)}";
//            cs = cn.prepareCall(usp);
//            cs.registerOutParameter(1, Types.OTHER);
//            cs.setString(2, "");
//            cs.setString(3, "");
//            cs.execute();
//            rs =  (ResultSet) cs.getObject(1);
//            EmpresaTO e = null;
//            while(rs.next()) {
//                e = new EmpresaTO(
//                rs.getLong("empresaid"),
//                rs.getString("nombre"),
//                rs.getString("ruc"),
//                rs.getString("direccion"),
//                rs.getString("url")
//                );
//                lista.add(e);
//        }
//         rs.close();
//         cs.close();
//       } catch (SQLException e) {
//            throw e;
//        } finally {
//            try {
//                cn.close();
//            } catch (SQLException e2) {
//            }
//        }
//        return lista;
try{        
cn = AccesoDB.conectabd();
        sql = "select * from basic.empresa order by nombre ";
        stm = cn.createStatement();
        rs = stm.executeQuery(sql);
        //cargar los clientes de rs a la coleccion lista
        while (rs.next()) {
            EmpresaTO cli = new EmpresaTO();
            //asignar valores al objeto cli
            cli.setEmpresaid(rs.getLong(1));
            cli.setNombre(rs.getString(2));
            cli.setRuc(rs.getString(3));
            cli.setDireccion(rs.getString(4));
            cli.setUrl(rs.getString(5));
            lista.add(cli);
        }
        rs.close();
        stm.close();
    
    }catch (SQLException e) {
            throw e;
    }finally {
            cn.close();
    }
    return lista ;

    }

    public void borrarContenidoTabla(JTable dtabla) {
  DefaultTableModel tab =(DefaultTableModel) dtabla.getModel();
        while(dtabla.getRowCount()>0){
            tab.removeRow(tab.getRowCount()-1);
        }    }

    public void cargarRegistrosTablas(JTable dtabla) {
        EmpresaTO lista[];
        lista = obtenerTodosRegistros (dtabla);
        


    }
    
//    public EmpresaTO[] obtenerTodosRegistros(int iduser) throws SQLException, ClassNotFoundException{
//        EmpresaTO lista[];
//        //conectarBD.conectar();
//      cn = AccesoDB.conectabd();
//        int numPac = Integer.parseInt(obtenerCampo(conectabd().RealizarConsulta("select count(*) from listanegra where iduser="+iduser+";"),"count"));
//        lista = new EmpresaTO[numPac];
//        ResultSet consulta;
//       sql = "select * from listanegra where iduser="+iduser+";";
//        try {
//            int i=0;
//            while(consulta.next()){
//                lista[i]=new EmpresaTO();
//                lista[i].setEmpresaid(Integer.parseInt(consulta.getString("empresaid")));
//                lista[i].setNombre(consulta.getString("nombre"));
//                lista[i].setRuc(consulta.getString("ruc"));
//                lista[i].setDireccion(consulta.getString("direccion"));
//                lista[i].setUrl(consulta.getString("url"));
//                i++;
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error: "+ex.getMessage());
//        }
//        cn.close();
//        return lista;
//    }
    
    
    
    
}

//    public String findForName(String nombre, String ruc) throws Exception {
////        String id = null;        
////        try {
////           cn = AccesoDB.conectabd();
////           String sql = "select empresaid from basic.empresa where nombre='" + nombre + "' or  ruc='" + ruc + "' " ;
////            PreparedStatement  ps = cn.prepareStatement(sql);
////            ResultSet rs = ps.executeQuery();
////            //cargar los clientes de rs a la coleccion lista
////            if (rs.next()) {
////                id = rs.getString(1);
////            }
////            rs.close();
////            ps.close();
////        } catch (SQLException e) {
////            throw e;
////        } finally {
////            cn.close();
////        }
////        return id; 
//    }

   
//    public String buscarString(String nombre, String ruc) throws Exception  {
//       boolean sw = false;    
//        try {
//           cn = AccesoDB.conectabd();
//           String sql = "select empresaid from basic.empresa where nombre='" + nombre + "' or  ruc='" + ruc + "' " ;
//            PreparedStatement  ps = cn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            //cargar los clientes de rs a la coleccion lista
//            if (rs.next()) {
//                id = rs.getString(1);
//            }
//            rs.close();
//            ps.close();
//        } catch (SQLException e) {
//            throw e;
//        } finally {
//            cn.close();
//        }
//        return id; 
//    }

