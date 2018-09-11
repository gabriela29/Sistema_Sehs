/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehs.CONTROLLER;

import sehs.DAO.ClienteDAO;

/**
 *
 * @author SEHS - TI
 */
public class ClienteBLL {
    ClienteDAO  dao;
    
  public ClienteBLL(){
      dao = new ClienteDAO();
  }
  
       
   public boolean validaUsuario(String usua, String pas)throws Exception {
        return dao.valida(usua, pas);
   }
          
}

