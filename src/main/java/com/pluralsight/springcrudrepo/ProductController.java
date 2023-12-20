package com.pluralsight.springcrudrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productDao;

    @RequestMapping(method=RequestMethod.GET, path="/anyproduct")
    public Product getProduct(){
        // Return product 42 just to prove it works
        return productDao.findById(42).get();
    }

    @RequestMapping(method=RequestMethod.GET, path="/products/{id}" )
    public Product getProductById(@PathVariable int id){
        return productDao.findById(id).get();
    }
}
