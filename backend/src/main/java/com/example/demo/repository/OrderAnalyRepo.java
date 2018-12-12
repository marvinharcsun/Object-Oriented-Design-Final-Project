package com.example.demo.repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.OrderAnaylisis;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
@CrossOrigin(origins ={"https://warm-tundra-14923.herokuapp.com","http:localhost:4200","https:localhost:4200"},allowedHeaders="*", maxAge = 3600)
public interface OrderAnalyRepo extends JpaRepository<OrderAnaylisis, Long> {

}