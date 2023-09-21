/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repaso.rest.controller;

import com.repaso.rest.medico.Especialidad;
import com.repaso.rest.medico.dto.MedicoDTO;
import com.repaso.rest.medico.MedicoEntity;
import com.repaso.rest.medico.MedicoRepositories;
import com.repaso.rest.medico.dto.MedicoGetDTO;
import com.repaso.rest.medico.dto.MedicoPutDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author kedwin
 */

@RestController
@RequestMapping("/medico")
public class MedicoControllers {
    
    @Autowired
    MedicoRepositories repositorio;
    /*
    segun las reglas del negocio solo
    permite optener el 
        id, 
        nombre, 
        email, 
        especialidad
    create un dto con esos valores
     *  
     */
    @GetMapping
    public Page<MedicoGetDTO> get( Pageable pag){
        return repositorio.findByActivoTrue(pag).map( medico -> new MedicoGetDTO(medico));
    }
    
    
    @PostMapping
    @Transactional
    public void post(@RequestBody MedicoDTO obj){
        MedicoEntity medico = new MedicoEntity(obj);
        repositorio.save(medico);
    }
    
    /*
    segun las reglas del negocio solo se podra cambiar el
    nombre,
    documento,
    direccion
    create un dto con esos valores
    */
    
    @PutMapping
    @Transactional
    public void put(@RequestBody @Valid MedicoPutDTO update){
        MedicoEntity medico = repositorio.getReferenceById(update.id());
        medico.update(update);
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public void deleteLogic(@PathVariable Long id){
        MedicoEntity medico = repositorio.getReferenceById(id);
        medico.desctivar();
    }
}
