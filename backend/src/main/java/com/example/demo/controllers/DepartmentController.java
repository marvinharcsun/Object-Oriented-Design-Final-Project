package com.example.demo.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;
@RestController
@CrossOrigin(origins ="https://warm-tundra-14923.herokuapp.com",allowedHeaders="*", maxAge = 3600)
public class DepartmentController {

 @Autowired
    DepartmentRepo departmentRepo;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
    	System.out.println(departmentRepo.findAll());
        return departmentRepo.findAll();

    }

    @PutMapping("/editDepartment")
   public Department update(@RequestBody Department department)
    {
        return departmentRepo.save(department);
    }


  

}