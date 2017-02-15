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
@Table(name = "puntos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puntos.findAll", query = "SELECT p FROM Puntos p"),
    @NamedQuery(name = "Puntos.findByIdCliente", query = "SELECT p FROM Puntos p WHERE p.idCliente = :idCliente"),
    @NamedQuery(name = "Puntos.findByNombreCliente", query = "SELECT p FROM Puntos p WHERE p.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Puntos.findByHotelV", query = "SELECT p FROM Puntos p WHERE p.hotelV = :hotelV"),
    @NamedQuery(name = "Puntos.findByGigisUsaquen", query = "SELECT p FROM Puntos p WHERE p.gigisUsaquen = :gigisUsaquen"),
    @NamedQuery(name = "Puntos.findByGigisZonaG", query = "SELECT p FROM Puntos p WHERE p.gigisZonaG = :gigisZonaG"),
    @NamedQuery(name = "Puntos.findByBar440", query = "SELECT p FROM Puntos p WHERE p.bar440 = :bar440"),
    @NamedQuery(name = "Puntos.findByBlackSheep", query = "SELECT p FROM Puntos p WHERE p.blackSheep = :blackSheep"),
    @NamedQuery(name = "Puntos.findByBierMarket", query = "SELECT p FROM Puntos p WHERE p.bierMarket = :bierMarket"),
    @NamedQuery(name = "Puntos.findByMarquez", query = "SELECT p FROM Puntos p WHERE p.marquez = :marquez"),
    @NamedQuery(name = "Puntos.findByBungalow", query = "SELECT p FROM Puntos p WHERE p.bungalow = :bungalow"),
    @NamedQuery(name = "Puntos.findByMatildelina", query = "SELECT p FROM Puntos p WHERE p.matildelina = :matildelina"),
    @NamedQuery(name = "Puntos.findByTotalConsumo", query = "SELECT p FROM Puntos p WHERE p.totalConsumo = :totalConsumo")})
public class Puntos implements Serializable {

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
    @Column(name = "Hotel_V")
    private float hotelV;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gigis_Usaquen")
    private float gigisUsaquen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gigis_Zona_G")
    private float gigisZonaG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bar_440")
    private float bar440;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Black_Sheep")
    private float blackSheep;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bier_Market")
    private float bierMarket;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Marquez")
    private float marquez;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bungalow")
    private float bungalow;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Matilde_lina")
    private float matildelina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Total_Consumo")
    private float totalConsumo;

    public Puntos() {
    }

    public Puntos(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Puntos(Integer idCliente, String nombreCliente, float hotelV, float gigisUsaquen, float gigisZonaG, float bar440, float blackSheep, float bierMarket, float marquez, float bungalow, float matildelina, float totalConsumo) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.hotelV = hotelV;
        this.gigisUsaquen = gigisUsaquen;
        this.gigisZonaG = gigisZonaG;
        this.bar440 = bar440;
        this.blackSheep = blackSheep;
        this.bierMarket = bierMarket;
        this.marquez = marquez;
        this.bungalow = bungalow;
        this.matildelina = matildelina;
        this.totalConsumo = totalConsumo;
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

    public float getHotelV() {
        return hotelV;
    }

    public void setHotelV(float hotelV) {
        this.hotelV = hotelV;
    }

    public float getGigisUsaquen() {
        return gigisUsaquen;
    }

    public void setGigisUsaquen(float gigisUsaquen) {
        this.gigisUsaquen = gigisUsaquen;
    }

    public float getGigisZonaG() {
        return gigisZonaG;
    }

    public void setGigisZonaG(float gigisZonaG) {
        this.gigisZonaG = gigisZonaG;
    }

    public float getBar440() {
        return bar440;
    }

    public void setBar440(float bar440) {
        this.bar440 = bar440;
    }

    public float getBlackSheep() {
        return blackSheep;
    }

    public void setBlackSheep(float blackSheep) {
        this.blackSheep = blackSheep;
    }

    public float getBierMarket() {
        return bierMarket;
    }

    public void setBierMarket(float bierMarket) {
        this.bierMarket = bierMarket;
    }

    public float getMarquez() {
        return marquez;
    }

    public void setMarquez(float marquez) {
        this.marquez = marquez;
    }

    public float getBungalow() {
        return bungalow;
    }

    public void setBungalow(float bungalow) {
        this.bungalow = bungalow;
    }

    public float getMatildelina() {
        return matildelina;
    }

    public void setMatildelina(float matildelina) {
        this.matildelina = matildelina;
    }

    public float getTotalConsumo() {
        return totalConsumo;
    }

    public void setTotalConsumo(float totalConsumo) {
        this.totalConsumo = totalConsumo;
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
        if (!(object instanceof Puntos)) {
            return false;
        }
        Puntos other = (Puntos) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entities.Puntos[ idCliente=" + idCliente + " ]";
    }
    
}
