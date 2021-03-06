package com.example.demo.repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ProductModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository


@CrossOrigin(origins = "https://warm-tundra-14923.herokuapp.com")
public interface ProductRepo extends JpaRepository<ProductModel, Long> {

}
