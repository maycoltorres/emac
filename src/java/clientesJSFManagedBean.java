/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.clientesDao;
import Dao.clientesDaoImp;
import Model.Clientes;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author USER
 */
@Named(value = "clientesJSFManagedBean")
@RequestScoped
public class clientesJSFManagedBean {

    private List<Clientes> movimientosFijos;
    public clientesJSFManagedBean() {
    }

    public List<Clientes> getMovimientosFijos() {
        clientesDao mDao= new clientesDaoImp();
        movimientosFijos = mDao.actualizaFijos();
        return movimientosFijos;
    }

    public void setMovimientosFijos(List<Clientes>  movimientosFijos) {
        this.movimientosFijos = movimientosFijos;
    }

    
    
}
