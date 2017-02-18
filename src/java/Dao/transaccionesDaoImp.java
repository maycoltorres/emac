/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import HibernateUtil.HibernateUtil;
import Model.Transacciones;
import java.util.Arrays;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author USER
 */
public class transaccionesDaoImp implements transaccionesDao{

    @Override
    public List<Transacciones> listarTransaccionesRes() {
        List<Transacciones> listarTransacciones= null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql="select distinct new Model.transaccionesPojo( t.nombreCliente as cliente,max(t.topeMax),max(t.porcentajeDesc),t.tipoFuncionario,sum(t.totalConsumo)) from Transacciones t group by t.nombreCliente,t.tipoFuncionario";
        
        try{
            listarTransacciones = session.createQuery(hql).list();

            System.out.println("//////////////////"+listarTransacciones);
            transaction.commit();
            session.close();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return listarTransacciones;
    }

    @Override
    public List<Transacciones> listarTransaccionesFecha(int fecha1, int fecha2) {
         fecha1=1;
         fecha2=2;
        System.out.println("********************************************************************************Fecha 1 y fecha 2 " +fecha1 + fecha2);
        List<Transacciones> listarTransaccionesFecha= null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql="from Transacciones  t where t.cantidad between " + fecha1 + " and " + fecha2 ;
        
        try{
            listarTransaccionesFecha = session.createQuery(hql).list();

            System.out.println("//////////////////"+listarTransaccionesFecha);
            transaction.commit();
            session.close();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return listarTransaccionesFecha;
    }

//    @Override
//    public Transacciones listarTransaccionesFecha(int fecha1, int fecha2) {
//         System.out.println("********************************************************************************Fecha 1 y fecha 2 " +fecha1 + fecha2);
//        List<Transacciones> listarTransaccionesFecha= null;
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//
//        String hql="from Transacciones  t where t.cantidad between " + fecha1 + " and " + fecha2 ;
//        
//        try{
//            listarTransaccionesFecha = session.createQuery(hql).list();
//
//            System.out.println("//////////////////"+listarTransaccionesFecha);
//            transaction.commit();
//            session.close();
//        }catch(HibernateException e){
//            System.out.println(e.getMessage());
//            transaction.rollback();
//        }
//        return (Transacciones) listarTransaccionesFecha;
//        
//    }



    @Override
    public List<Transacciones> listarTotalConsumo() {
        List<Transacciones> listarTransacciones= null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql="select new Model.transaccionesPojo(sum(t.totalConsumo),sum(t.valorNeto),sum(t.valorDesc)) from Transacciones t";
        
        try{
            listarTransacciones = session.createQuery(hql).list();

            System.out.println("//////////////////"+listarTransacciones);
            transaction.commit();
            session.close();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
        return listarTransacciones;
    }

  

    
    
}
