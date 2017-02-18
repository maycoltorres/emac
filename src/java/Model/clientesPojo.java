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
public class clientesPojo {
    int idCliente;
    Float topeMaximo;

    public clientesPojo(int idCliente, Float topeMaximo) {
        this.idCliente = idCliente;
        this.topeMaximo = topeMaximo;
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
