/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Transacciones;
import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public interface transaccionesDao {
    public List<Transacciones> listarTransaccionesRes();

    public List<Transacciones> listarTransaccionesFecha(Date fecha1, Date fecha2);
    
    public List<Transacciones> listarTotalConsumo();
   
}
