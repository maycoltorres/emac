/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "movimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientos.findAll", query = "SELECT m FROM Movimientos m"),
    @NamedQuery(name = "Movimientos.findByIdMovimiento", query = "SELECT m FROM Movimientos m WHERE m.idMovimiento = :idMovimiento"),
    @NamedQuery(name = "Movimientos.findBySaldoInicial", query = "SELECT m FROM Movimientos m WHERE m.saldoInicial = :saldoInicial"),
    @NamedQuery(name = "Movimientos.findByDebito", query = "SELECT m FROM Movimientos m WHERE m.debito = :debito"),
    @NamedQuery(name = "Movimientos.findByCredito", query = "SELECT m FROM Movimientos m WHERE m.credito = :credito"),
    @NamedQuery(name = "Movimientos.findBySaldoDisponible", query = "SELECT m FROM Movimientos m WHERE m.saldoDisponible = :saldoDisponible")})
public class Movimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMovimiento")
    private Integer idMovimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saldoInicial")
    private float saldoInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "debito")
    private float debito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "credito")
    private float credito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saldoDisponible")
    private float saldoDisponible;
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false)
    private Clientes idCliente;

    public Movimientos() {
    }

    public Movimientos(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Movimientos(Integer idMovimiento, float saldoInicial, float debito, float credito, float saldoDisponible) {
        this.idMovimiento = idMovimiento;
        this.saldoInicial = saldoInicial;
        this.debito = debito;
        this.credito = credito;
        this.saldoDisponible = saldoDisponible;
    }

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public float getDebito() {
        return debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(float saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimiento != null ? idMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimientos)) {
            return false;
        }
        Movimientos other = (Movimientos) object;
        if ((this.idMovimiento == null && other.idMovimiento != null) || (this.idMovimiento != null && !this.idMovimiento.equals(other.idMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entities.Movimientos[ idMovimiento=" + idMovimiento + " ]";
    }
    
}
