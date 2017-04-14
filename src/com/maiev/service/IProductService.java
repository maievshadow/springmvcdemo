package com.maiev.service;

import com.maiev.pojo.Product;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by maievshabu on 2017/4/12.
 */
public interface IProductService {
    void increasePriceOfAllProductsInCategory(final String category);

    String helloWorld();

    List<Product> getProdList();

    void saveProduct();

}
