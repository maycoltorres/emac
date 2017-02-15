/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Facade;

import com.Entities.Transacciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class TransaccionesFacade extends AbstractFacade<Transacciones> {

    @PersistenceContext(unitName = "WebAppEmac1.1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransaccionesFacade() {
        super(Transacciones.class);
    }
    
}
