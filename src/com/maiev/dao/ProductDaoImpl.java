package com.maiev.dao;

import java.util.*;
import com.maiev.pojo.Product;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


/**
 * Created by maievshabu on 2017/4/12.
 */
@SuppressWarnings("unchecked")
@Repository
@Transactional
public class ProductDaoImpl implements IProductDao {

    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public SessionFactory getSessionFactory(){
        return this.sessionFactory;
    }

    @Override
    public List loadProductsByCategory(String category) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("from Product product where product.category=?")
                .setParameter(0, category)
                .list();
    }

    @Override
    public List<Product> getProdList()
    {
        String hql="from Product p";//使用命名参数，推荐使用，易读。
        Query query = sessionFactory.getCurrentSession().createQuery(hql);

        List<Product> list = query.list();

        return list;
    }

    @Override
    public void saveProduct()
    {
//        Transaction tx = sessionFactory.getCurrentSession().beginTransaction();

        Product p = new Product();
        p.setName("maiev");
        p.setCategory("categroy");

        sessionFactory.getCurrentSession().save(p);

//        tx.commit();
//        sessionFactory.getCurrentSession().close();
    }

    @Override
    public String helloWorld()
    {
        return "hello world xxxx";
    }
}
