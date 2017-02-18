/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.transaccionesDao;
import Dao.transaccionesDaoImp;
import Model.Transacciones;
import Model.transaccionesPojo;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author USER
 */
@Named(value = "transaccionesJSFManagedBean")
@Dependent
public class transaccionesJSFManagedBean {

    private List<transaccionesPojo> filtroCliente ;
    private List<Transacciones> listar;
    private List<Transacciones> listarTotalConsumo;
    private List<Transacciones> fecha;
    private Transacciones transacciones;

    public List<Transacciones> getListarTotalConsumo() {
        transaccionesDao cDao = new transaccionesDaoImp();
        listar= cDao.listarTotalConsumo();
        return listar;
    }

    public void setListarTotalConsumo(List<Transacciones> listarTotalConsumo) {
        this.listarTotalConsumo = listarTotalConsumo;
    }
    
    
    public transaccionesJSFManagedBean() {
    }

    public List<Transacciones> getListar() {
        transaccionesDao cDao = new transaccionesDaoImp();
        listar= cDao.listarTransaccionesRes();
        return listar;
    }

    public void setListar(List<Transacciones> listar) {
        this.listar = listar;
    }

    public Transacciones getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transacciones transacciones) {
        this.transacciones = transacciones;
    }

    public List<transaccionesPojo> getFiltroCliente() {
        return filtroCliente;
    }

    public void setFiltroCliente(List<transaccionesPojo> filtroCliente) {
        this.filtroCliente = filtroCliente;
    }

    public List<Transacciones> getFecha(Date fecha1, Date fecha2) {
        transaccionesDao cDao = new transaccionesDaoImp();
        fecha=  cDao.listarTransaccionesFecha(fecha1,fecha2);
        return fecha;
    }

    public void setFecha(List<Transacciones> fecha) {
        this.fecha = fecha;
    }


    
}
