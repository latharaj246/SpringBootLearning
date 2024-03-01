package com.latha.springweb.Controller;

import entites.Product;
import org.springframework.web.bind.annotation.*;
import repos.ProductRepository;

import java.util.List;

@RestController
public class ProductRestController {

    ProductRepository productRepository;
    //getproduct
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public  List<Product> getProduct(){
        return productRepository.findAll();

    }
    //get product with value
    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }
//create a product
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
    // update product
    @RequestMapping(value = "/products", method = RequestMethod.PUT)
    public Product updateProduct (@RequestBody  Product product){
        return productRepository.save(product);
    }
    //delete product

    @RequestMapping(value = "product/{id}", method = RequestMethod.DELETE)
    public void DeleteProduct (@PathVariable("id") int id) {
         productRepository.deleteById(id);
    }

}
