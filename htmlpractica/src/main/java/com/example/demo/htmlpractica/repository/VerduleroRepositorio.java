package com.example.demo.htmlpractica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.htmlpractica.resources.*;

public interface VerduleroRepositorio extends JpaRepository<Verdulero, String>{
    
   public Verdulero findbyid(String id);   
}
    
