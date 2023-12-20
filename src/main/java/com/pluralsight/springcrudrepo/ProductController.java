package com.pluralsight.springcrudrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productDao;

    @RequestMapping(method=RequestMethod.GET, path="/")
    public Product getProduct(){
        // Return product 42 just to prove it works
        return productDao.findById(42).get();
    }
}
