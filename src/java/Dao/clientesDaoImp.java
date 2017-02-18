/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import HibernateUtil.HibernateUtil;
import Model.Clientes;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author USER
 */
public class clientesDaoImp implements clientesDao{

    @Override
    public List<Clientes> actualizaFijos() {
 
    
        List<Clientes> listarClientes= null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql="select new Model.clientesPojo(c.idCliente, c.topeMaximo) from Clientes c";
        
        try{
            listarClientes = session.createQuery(hql).list();

            System.out.println("//////////////////"+listarClientes);
            session.save(listarClientes);
            transaction.commit();
            session.close();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return listarClientes;
    }
    
}
