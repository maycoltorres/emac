/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import HibernateUtil.HibernateUtil;
import Model.Clientes;
import Model.Movimientos;
import Model.clientesPojo;
import Model.movimientosPojo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author USER
 */
public class movimientosDaoImp implements movimientosDao{

    @Override
    public String actualizaFijos() {
        List<Clientes> listarClientes = null;
        movimientosPojo actualiza= null;
        
        //List<clientesPojo> listarClientesPojo = new ArrayList<clientesPojo>();
         Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql="select new Model.clientesPojo(c.idCliente, c.topeMaximo) from Clientes c";
        
        try{
            listarClientes = session.createQuery(hql).list();

            System.out.println("////////////////// Lista de id y tope"+listarClientes);
            for (int i = 0; i < listarClientes.size(); i++) {
                
               Movimientos datos = new Movimientos(actualiza.getTopeMaximo(),0,0,actualiza.getTopeMaximo(),actualiza.getIdCliente()); 
               session.save(datos);
               transaction.commit();
               session.close();
               
                
            }

            
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return "Actualizado exitosamente";
    }
    
}
