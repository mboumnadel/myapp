/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.*;
import model.Products;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;


/**
 *
 * @author mboumnadel
 */
public class ProductsDAO {
    
    public static List<Products> getProducts(int start, int maxRows){
        List<Products> products;
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Query q = session.createQuery ("from Products as prod");
        q.setFirstResult(start);
        q.setMaxResults(maxRows);
        products = (List<Products>) q.list();
        
        return products;
    }
}
