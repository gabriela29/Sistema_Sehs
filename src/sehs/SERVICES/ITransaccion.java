/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehs.SERVICES;

/**
 *
 * @author Alumno
 * @param <T>
 */
public interface ITransaccion <T>{
    
    int registrar(T o) throws Exception;
}
