 package com.example.demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.validation.Valid;
import com.example.demo.entity.OrderAnaylisis;
import com.example.demo.repository.OrderAnalyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@CrossOrigin(origins ={"https://warm-tundra-14923.herokuapp.com","http:localhost:4200","https:localhost:4200"},allowedHeaders="*", maxAge = 3600)
public class OrderAnaylisisController {

 @Autowired
    OrderAnalyRepo orderRepo;
    
     
    @GetMapping("/order_details")
    public List<OrderAnaylisis> findAll()
    {
        return orderRepo.findAll();
    }
   


  

     @PostMapping("/createOrderDetails")
    public OrderAnaylisis create(@RequestBody OrderAnaylisis order)
    {
        return  orderRepo.save(order);
    }

  @PutMapping("/createOrderDetails")
   public OrderAnaylisis update(@RequestBody OrderAnaylisis order)
    {
        return orderRepo.save(order);
    }

   @DeleteMapping("/order_metadata/{id}")
     public List<OrderAnaylisis> delete(@PathVariable("id") Long order_id)
     {
         orderRepo.deleteById(order_id);
         return orderRepo.findAll();
     }



}