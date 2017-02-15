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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "transacciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transacciones.findAll", query = "SELECT t FROM Transacciones t "),
    @NamedQuery(name = "Transacciones.findByIdTransaccion", query = "SELECT t FROM Transacciones t WHERE t.idTransaccion = :idTransaccion"),
    @NamedQuery(name = "Transacciones.findByNombreCliente", query = "SELECT t FROM Transacciones t WHERE t.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Transacciones.findByIdPunto", query = "SELECT t FROM Transacciones t WHERE t.idPunto = :idPunto"),
    @NamedQuery(name = "Transacciones.findByPunto", query = "SELECT t FROM Transacciones t WHERE t.punto = :punto"),
    @NamedQuery(name = "Transacciones.findByFecha", query = "SELECT t FROM Transacciones t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Transacciones.findByHora", query = "SELECT t FROM Transacciones t WHERE t.hora = :hora"),
    @NamedQuery(name = "Transacciones.findByIdProducto", query = "SELECT t FROM Transacciones t WHERE t.idProducto = :idProducto"),
    @NamedQuery(name = "Transacciones.findByDescProducto", query = "SELECT t FROM Transacciones t WHERE t.descProducto = :descProducto"),
    @NamedQuery(name = "Transacciones.findByCantidad", query = "SELECT t FROM Transacciones t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "Transacciones.findByValorNeto", query = "SELECT t FROM Transacciones t WHERE t.valorNeto = :valorNeto"),
    @NamedQuery(name = "Transacciones.findByValorDesc", query = "SELECT t FROM Transacciones t WHERE t.valorDesc = :valorDesc"),
    @NamedQuery(name = "Transacciones.findByPorcentajeDesc", query = "SELECT t FROM Transacciones t WHERE t.porcentajeDesc = :porcentajeDesc"),
    @NamedQuery(name = "Transacciones.findByTotalConsumo", query = "SELECT t FROM Transacciones t WHERE t.totalConsumo = :totalConsumo"),
    @NamedQuery(name = "Transacciones.findByCajero", query = "SELECT t FROM Transacciones t WHERE t.cajero = :cajero"),
    @NamedQuery(name = "Transacciones.findByMesero", query = "SELECT t FROM Transacciones t WHERE t.mesero = :mesero"),
    @NamedQuery(name = "Transacciones.findByNumDocumento", query = "SELECT t FROM Transacciones t WHERE t.numDocumento = :numDocumento"),
    @NamedQuery(name = "Transacciones.findByTipoDocumento", query = "SELECT t FROM Transacciones t WHERE t.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Transacciones.findByNumLicencia", query = "SELECT t FROM Transacciones t WHERE t.numLicencia = :numLicencia"),
    @NamedQuery(name = "Transacciones.findByFechaTransaccion", query = "SELECT t FROM Transacciones t WHERE t.fechaTransaccion = :fechaTransaccion"),
    @NamedQuery(name = "Transacciones.findByTipoFuncionario", query = "SELECT t FROM Transacciones t WHERE t.tipoFuncionario = :tipoFuncionario"),
    @NamedQuery(name = "Transacciones.findByTopeMax", query = "SELECT t FROM Transacciones t WHERE t.topeMax = :topeMax")})
public class Transacciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTransaccion")
    private Integer idTransaccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreCliente")
    private String nombreCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPunto")
    private int idPunto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "punto")
    private String punto;
    @Size(max = 45)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 45)
    @Column(name = "hora")
    private String hora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProducto")
    private int idProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descProducto")
    private String descProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorNeto")
    private float valorNeto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorDesc")
    private float valorDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentajeDesc")
    private float porcentajeDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalConsumo")
    private float totalConsumo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cajero")
    private String cajero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mesero")
    private String mesero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numDocumento")
    private String numDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numLicencia")
    private String numLicencia;
    @Size(max = 45)
    @Column(name = "fechaTransaccion")
    private String fechaTransaccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoFuncionario")
    private String tipoFuncionario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TopeMax")
    private float topeMax;

    public Transacciones() {
    }

    public Transacciones(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Transacciones(Integer idTransaccion, String nombreCliente, int idPunto, String punto, int idProducto, String descProducto, int cantidad, float valorNeto, float valorDesc, float porcentajeDesc, float totalConsumo, String cajero, String mesero, String numDocumento, String tipoDocumento, String numLicencia, String tipoFuncionario, float topeMax) {
        this.idTransaccion = idTransaccion;
        this.nombreCliente = nombreCliente;
        this.idPunto = idPunto;
        this.punto = punto;
        this.idProducto = idProducto;
        this.descProducto = descProducto;
        this.cantidad = cantidad;
        this.valorNeto = valorNeto;
        this.valorDesc = valorDesc;
        this.porcentajeDesc = porcentajeDesc;
        this.totalConsumo = totalConsumo;
        this.cajero = cajero;
        this.mesero = mesero;
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
        this.numLicencia = numLicencia;
        this.tipoFuncionario = tipoFuncionario;
        this.topeMax = topeMax;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdPunto() {
        return idPunto;
    }

    public void setIdPunto(int idPunto) {
        this.idPunto = idPunto;
    }

    public String getPunto() {
        return punto;
    }

    public void setPunto(String punto) {
        this.punto = punto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(float valorNeto) {
        this.valorNeto = valorNeto;
    }

    public float getValorDesc() {
        return valorDesc;
    }

    public void setValorDesc(float valorDesc) {
        this.valorDesc = valorDesc;
    }

    public float getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(float porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public float getTotalConsumo() {
        return totalConsumo;
    }

    public void setTotalConsumo(float totalConsumo) {
        this.totalConsumo = totalConsumo;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public float getTopeMax() {
        return topeMax;
    }

    public void setTopeMax(float topeMax) {
        this.topeMax = topeMax;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaccion != null ? idTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transacciones)) {
            return false;
        }
        Transacciones other = (Transacciones) object;
        if ((this.idTransaccion == null && other.idTransaccion != null) || (this.idTransaccion != null && !this.idTransaccion.equals(other.idTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entities.Transacciones[ idTransaccion=" + idTransaccion + " ]";
    }
    
}
