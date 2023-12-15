package com.example.demo.htmlpractica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.htmlpractica.service.VerduleroService;

@Controller
@RequestMapping("/")
public class verduleroControlador {
    
    @Autowired
    private VerduleroService verduleroservicio;

   

}
