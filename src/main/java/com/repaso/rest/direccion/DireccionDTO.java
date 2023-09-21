/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repaso.rest.direccion;

/**
 *
 * @author kedwin
 */
public record DireccionDTO(
        
        String calle,
        String distrito,
        String ciudad,
        String numero,
        String complemento
        
        ) {
    
}
