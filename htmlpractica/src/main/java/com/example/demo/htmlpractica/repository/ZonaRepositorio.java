package com.example.demo.htmlpractica.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.htmlpractica.resources.zona;


@Repository
public interface ZonaRepositorio extends JpaRepository<zona, String>{
    
}
