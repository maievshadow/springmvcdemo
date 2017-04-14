package com.maiev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.*;
import javax.annotation.Resource;

import java.util.List;

import com.maiev.dao.IProductDao;
import com.maiev.pojo.Product;

/**
 * Created by maievshabu on 2017/4/12.
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Resource(name = "productDao")
    private IProductDao productDao;

    @Override
    @Transactional
    public void increasePriceOfAllProductsInCategory(final String category) {
        List productsToChange = this.productDao.loadProductsByCategory(category);
    }

    @Override
    public String helloWorld()
    {

        String h = "xxx";

        return h;

//         return productDao.helloWorld();
    }


    @Override
    public  List<Product> getProdList()
    {
        List<Product> list = productDao.getProdList();

        return list;
    }

    @Override
    public void saveProduct()
    {
        productDao.saveProduct();

        return ;
    }
}
