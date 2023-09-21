/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.repaso.rest.medico.dto;

import com.repaso.rest.direccion.DireccionDTO;
import org.springframework.lang.NonNull;


/**
 *
 * @author kedwin
 */
public record MedicoPutDTO(
        
        @NonNull
        Long id,
        String nombre,
        String documento,
        DireccionDTO direccion
        ) {

}
