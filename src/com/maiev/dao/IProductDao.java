package com.maiev.dao;

import java.util.*;

import org.hibernate.SessionFactory;

import com.maiev.pojo.Product;

/**
 * Created by maievshabu on 2017/4/12.
 */
public interface IProductDao {

    void setSessionFactory(SessionFactory sessionFactory);

    SessionFactory getSessionFactory();

    List loadProductsByCategory(String category);

    List<Product> getProdList();

    void saveProduct();

    String helloWorld();
}
