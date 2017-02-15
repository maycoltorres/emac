/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdCliente", query = "SELECT c FROM Clientes c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Clientes.findByNombreCliente", query = "SELECT c FROM Clientes c WHERE c.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Clientes.findByTipoFuncionario", query = "SELECT c FROM Clientes c WHERE c.tipoFuncionario = :tipoFuncionario"),
    @NamedQuery(name = "Clientes.findByTopeMaximo", query = "SELECT c FROM Clientes c WHERE c.topeMaximo = :topeMaximo"),
    @NamedQuery(name = "Clientes.findByPorcentajeDescuento", query = "SELECT c FROM Clientes c WHERE c.porcentajeDescuento = :porcentajeDescuento"),
    @NamedQuery(name = "Clientes.findByFechaCreacion", query = "SELECT c FROM Clientes c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Clientes.findByFechaModificacion", query = "SELECT c FROM Clientes c WHERE c.fechaModificacion = :fechaModificacion")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreCliente")
    private String nombreCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoFuncionario")
    private String tipoFuncionario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "topeMaximo")
    private float topeMaximo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentajeDescuento")
    private float porcentajeDescuento;
    @Size(max = 45)
    @Column(name = "fechaCreacion")
    private String fechaCreacion;
    @Size(max = 45)
    @Column(name = "fechaModificacion")
    private String fechaModificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<Movimientos> movimientosCollection;

    public Clientes() {
    }

    public Clientes(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Clientes(Integer idCliente, String nombreCliente, String tipoFuncionario, float topeMaximo, float porcentajeDescuento) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.tipoFuncionario = tipoFuncionario;
        this.topeMaximo = topeMaximo;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public float getTopeMaximo() {
        return topeMaximo;
    }

    public void setTopeMaximo(float topeMaximo) {
        this.topeMaximo = topeMaximo;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @XmlTransient
    public Collection<Movimientos> getMovimientosCollection() {
        return movimientosCollection;
    }

    public void setMovimientosCollection(Collection<Movimientos> movimientosCollection) {
        this.movimientosCollection = movimientosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entities.Clientes[ idCliente=" + idCliente + " ]";
    }
    
}
