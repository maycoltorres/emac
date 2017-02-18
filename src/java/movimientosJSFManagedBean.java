/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.movimientosDao;
import Dao.movimientosDaoImp;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author USER
 */
@Named(value = "movimientosJSFManagedBean")
@RequestScoped
public class movimientosJSFManagedBean {

    private String actualizaFijos;
    public movimientosJSFManagedBean() {
    }

    public String actualizaFijos() {
        movimientosDao mDao= new movimientosDaoImp();
        actualizaFijos = mDao.actualizaFijos();
        return "Actualizado exitosamente";
    }

    public void setActualizaFijos(String actualizaFijos) {
        this.actualizaFijos = actualizaFijos;
    }

    
    
}
