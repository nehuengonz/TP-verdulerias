package com.example.demo.htmlpractica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.htmlpractica.resources.verdura;

public interface VerduraRepositorio extends JpaRepository<verdura,String>{
    
}
