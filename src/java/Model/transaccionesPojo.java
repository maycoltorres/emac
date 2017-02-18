/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author USER
 * 
 * 
 */
public class transaccionesPojo {
    String cliente;
    Float tope;
    Float porcentaje;
    String tipo;
    Double total;
    Double totalDescuento;
    Double totalNeto;
    

    public transaccionesPojo(String cliente, Float tope, Float porcentaje, String tipo, Double total) {
        this.cliente = cliente;
        this.tope = tope;
        this.porcentaje = porcentaje;
        this.tipo = tipo;
        this.total = total;
    }

    public transaccionesPojo(Double total,Double totalDescuento,Double totalNeto) {
        this.totalDescuento = totalDescuento;
        this.totalNeto = totalNeto;
        this.total = totalNeto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Float getTope() {
        return tope;
    }

    public void setTope(Float tope) {
        this.tope = tope;
    }

    public Float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(Double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public Double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(Double totalNeto) {
        this.totalNeto = totalNeto;
    }


    
    
}
