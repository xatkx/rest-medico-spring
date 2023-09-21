/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repaso.rest.direccion;

import jakarta.persistence.Embeddable;

/**
 *
 * @author kedwin
 */
@Embeddable
public class DireccionEmbedable {
    
    private String calle;
    private String distrito;
    private String ciudad;
    private String numero;
    private String complemento;

    public DireccionEmbedable() {
    }

    public DireccionEmbedable(String calle, String distrito, String ciudad, String numero, String complemento) {
        this.calle = calle;
        this.distrito = distrito;
        this.ciudad = ciudad;
        this.numero = numero;
        this.complemento = complemento;
    }
    

    public DireccionEmbedable(DireccionDTO direccion) {
        this.calle = direccion.calle();
        this.distrito = direccion.distrito();
        this.ciudad = direccion.ciudad();
        this.numero = direccion.numero();
        this.complemento = direccion.complemento();
    }

    public DireccionEmbedable update(DireccionDTO direccion) {
        this.calle = direccion.calle();
        this.distrito = direccion.distrito();
        this.ciudad = direccion.ciudad();
        this.numero = direccion.numero();
        this.complemento = direccion.complemento();
        
        return this;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
}
