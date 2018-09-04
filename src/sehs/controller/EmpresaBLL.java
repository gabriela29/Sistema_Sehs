/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehs.controller;

import java.util.List;
import sehs.dao.EmpresaDAO;
import sehs.entity.EmpresaTO;
import uni.util.Constante;


/**
 *
 * @author SEHS - TI
 */
public class EmpresaBLL {
    EmpresaDAO dao;
    
    //cosntructor

    public EmpresaBLL() {
        dao = new EmpresaDAO();
    }

   
    //metodos de negocio
    
    public List<EmpresaTO> empresaListar() throws Exception {
        return dao.readAll();
    }
    
    public String empresaBuscar (String nombre, String ruc) throws Exception{
        return dao.findForName(nombre, ruc);
    }
    
    public String empresaProcesar (EmpresaTO p, int opcion) throws  Exception{
   String msj = "";
        switch (opcion) {
            case Constante.INSERT:
                dao.create(p);
                msj = "Empresa registrado con exito";
                break;
            case Constante.UPDATE:
                dao.update(p);
                msj = "Empresa actualizado con exito";
                break;
            case Constante.DELETE:
                dao.delete(p);
                msj = "Empresa eliminado con exito";
                break;
        }
        return msj;
    }
    
//   public boolean validaUsuario(String usu, String pas) throws Exception{
//    return dao.valida(usu, pas);
//}
    
//    public String Codigodeempresa(String nombre) throws Exception{
//    return dao.findForName(nombre);
//}
//    

    
   
}

