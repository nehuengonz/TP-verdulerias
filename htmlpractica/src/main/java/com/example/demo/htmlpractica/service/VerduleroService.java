package com.example.demo.htmlpractica.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.htmlpractica.Exception.MyException;
import com.example.demo.htmlpractica.repository.VerduleroRepositorio;
import com.example.demo.htmlpractica.repository.VerduraRepositorio;
import com.example.demo.htmlpractica.repository.ZonaRepositorio;
import com.example.demo.htmlpractica.resources.Verdulero;
import com.example.demo.htmlpractica.resources.verdura;
import com.example.demo.htmlpractica.resources.zona;

import jakarta.transaction.Transactional;

@Service
public class VerduleroService {
    
    @Autowired
    private VerduleroRepositorio verdulerorepositorio;

    @Autowired
    private VerduraRepositorio verdurarepositorio; 

    @Autowired

    private ZonaRepositorio zonarepositorio;

    @Transactional
    public void crearVerdulero(String id,String nombreverdulero,String idverdura,String idzona) throws MyException
    {
        validar(id, nombreverdulero, idverdura, idzona);

        Optional<Verdulero> respuesta = verdulerorepositorio.findById(id);
        Optional<verdura> respuestaverdura = verdurarepositorio.findById(idverdura);
        Optional<zona> respuestazona = zonarepositorio.findById(idzona);

        verdura verdura = new verdura();
        zona zona = new zona();

        if (respuestaverdura.isPresent())
        {
            verdura = respuestaverdura.get();
        }
        if (respuestazona.isPresent())
        {
            zona = respuestazona.get();
        }
        
        Verdulero verdulero = new Verdulero();
        verdulero.setId(id);
        verdulero.setNombreVerdulero(nombreverdulero);
        verdulero.setVerdura(verdura);
        verdulero.setZona(zona);

        verdulerorepositorio.save(verdulero); 

    }

    public void validar(String id,String nombreverdulero,String idverdura,String idzona) throws MyException
    {
        if (id == null)
        {
            throw new MyException("el id no puede ser nulo nulo");
        }
        if (nombreverdulero.isEmpty() || nombreverdulero== null) {
            throw new MyException("el nombre del verdulero no puede ser nulo ni estar vacio");
        }
        if (idverdura.isEmpty() || idverdura== null)
        {
            throw new MyException("el id de verdura no puede ser nulo ni estar vacio");
        }
        if (idzona.isEmpty() || idzona == null)
        {
            throw new MyException("el id de zona no puede estar vacio ni ser nulo");
        }
    }
}
