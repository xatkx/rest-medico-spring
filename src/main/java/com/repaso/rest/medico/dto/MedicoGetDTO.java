/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.repaso.rest.medico.dto;

import com.repaso.rest.medico.Especialidad;
import com.repaso.rest.medico.MedicoEntity;

/**
 *
 * @author kedwin
 */
public record MedicoGetDTO(
        
        long id,
        String nombre,
        String email,
        String especialidad
        
        ) {

    public MedicoGetDTO(MedicoEntity medico) {
        this(
                medico.getId(),
                medico.getNombre(),
                medico.getEmail(),
                medico.getEspecialidad().toString());
    }

}
