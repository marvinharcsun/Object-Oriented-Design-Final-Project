package com.example.demo.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.validation.Valid;
import com.example.demo.entity.ProductModel;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
 @CrossOrigin(origins = "*",allowedHeaders="*", maxAge = 3600)
public class Product {

 @Autowired
    ProductRepo productRepo;
    
     
    @GetMapping("/products")
    public List<ProductModel> findAll()
    {
        return productRepo.findAll();
    }
 @PostMapping("/createProduct")
    public ProductModel create(@RequestBody ProductModel product)
    {
        return productRepo.save(product);
    }


  

  @PutMapping("/createProduct")
   public ProductModel update(@RequestBody ProductModel product)
    {
        return productRepo.save(product);
    }
    @DeleteMapping("/products/{id}")
     public List<ProductModel> delete(@PathVariable("id") Long product_id)
     {
         productRepo.deleteById(product_id);
         return productRepo.findAll();
     }
 


}

  
