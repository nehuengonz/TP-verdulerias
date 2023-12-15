package com.example.demo.htmlpractica.resources;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class verdura {
    @Id
    private String Id; 
    private Long precio;
    private String nombre;
    
    @Temporal(TemporalType.DATE)
    private Date alta;

}
