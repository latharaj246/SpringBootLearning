package com.latha.springweb.Controller;

import entites.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repos.ProductRepository;

import java.util.List;


@RestController
public class ProductRestController {

    @Autowired
    ProductRepository productRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);
    //getproduct
    @GetMapping(value = "/product"  )
    public  List<Product> getProduct(){
        return productRepository.findAll();

    }
    //get product with value
    @GetMapping(value = "/product/{id}")
    public Product getProduct(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }
//create a product
    @PostMapping(value = "/product")
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
    // update product
    @PostMapping(value = "/products")
    public Product updateProduct (@RequestBody  Product product){
        return productRepository.save(product);
    }
    //delete product

    @RequestMapping(value = "product/{id}", method = RequestMethod.DELETE)
    public void DeleteProduct (@PathVariable("id") int id) {
        LOGGER.info("Finding Product by ID"+ id);
         productRepository.deleteById(id);
    }

}
