/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author USER
 */
public class movimientosPojo {
     int idCliente;
    Float topeMaximo;

    public movimientosPojo(int idCliente, Float topeMaximo) {
        this.idCliente = idCliente;
        this.topeMaximo = topeMaximo;
    }

    public movimientosPojo(Float topeMaximo, int i, int i0, Float topeMaximo0, int idCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public movimientosPojo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Float getTopeMaximo() {
        return topeMaximo;
    }

    public void setTopeMaximo(Float topeMaximo) {
        this.topeMaximo = topeMaximo;
    }
    
    
}
