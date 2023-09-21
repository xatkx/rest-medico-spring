/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.repaso.rest.medico.dto;

import com.repaso.rest.direccion.DireccionDTO;
import com.repaso.rest.medico.Especialidad;

/**
 *
 * @author kedwin
 */
public record MedicoDTO(
        
        String nombre,
        String email,
        String telefono,
        String documento,
        Especialidad especialidad,
        DireccionDTO direccion
        
        ) {

}
