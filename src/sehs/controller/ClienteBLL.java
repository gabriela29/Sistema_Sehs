/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehs.controller;

import sehs.dao.ClienteDao;

/**
 *
 * @author SEHS - TI
 */
public class ClienteBLL {
    ClienteDao  dao;
    
  public ClienteBLL(){
      dao = new ClienteDao();
  }
  
       
   public boolean validaUsuario(String usua, String pas)throws Exception {
        return dao.valida(usua, pas);
   }
          
}

