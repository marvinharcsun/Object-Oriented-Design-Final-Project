package com.example.demo.entity;
import javax.persistence.ManyToOne;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import java.util.List;
import java.io.Serializable;
 

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
@Entity
@Table(name = "items_sold")
public class ProductModel implements Serializable{
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  product_id;


    private String product_name;

 

    private double price;

    private boolean active=true;
    
      private int aisle_id;

    private int department_id;
   @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = Aisle.class)
    @JoinColumn(name="aisle_id",referencedColumnName="id",insertable=false, updatable=false)
   private Aisle aisle;

 public double getPrice(){
  return price;
 }

 public void setPrice(Double price){
  this.price=price;
  return;
 }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
    return;
  }

 





public Department getDepartment(){
    return department;
   }

   public void setDepartment(Department department){
    this.department=department;
    return;
   }

  @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = Department.class)
    @JoinColumn(name="department_id",referencedColumnName="id", insertable=false, updatable=false)
   private Department department;
    
 
    public Long getId() {
        return product_id;
    }

    public void setId(Long product_id) {
        this.product_id = product_id;
        return;
    }

    public String getTitle() {
        return product_name;
    }

    public void setTitle(String product_name) {
        this.product_name =product_name;
        return;
    }

   public int getAisleId(){
        return aisle_id;
   }
  

   public void setAisleId(int aisle_id) {
    this.aisle_id=aisle_id;
    return;
   }

public Aisle getAisle(){
      return aisle;
    }

   public void setAisle(Aisle aisle){
    this.aisle=aisle;
    return;
   }



   public int getDepartmentId(){
      return department_id;
   }
    
  


 


 public void setDepartmentId(int  department_id) {
    this.department_id=department_id;
    return;
   }
  

}