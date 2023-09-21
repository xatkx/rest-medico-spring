/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repaso.rest.medico;


import com.repaso.rest.medico.dto.MedicoDTO;
import com.repaso.rest.direccion.DireccionEmbedable;
import com.repaso.rest.medico.dto.MedicoPutDTO;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author kedwin
 */
@Entity(name="medico_2")
@Table(name = "medico")
public class MedicoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private String email;
    private String documento;
    private String telefono;
    private boolean activo;
    
    @Enumerated(EnumType.STRING)
    Especialidad especialidad;
    
    @Embedded
    DireccionEmbedable direccion;

    public MedicoEntity( String nombre, String email, String documento, Especialidad especialidad, DireccionEmbedable direccion) {
    
        this.nombre = nombre;
        this.email = email;
        this.documento = documento;
        this.especialidad = especialidad;
        this.direccion = direccion;
    }

    
    public MedicoEntity() {
    }

    public MedicoEntity(MedicoDTO obj) {
        this.activo = true;
        this.telefono = obj.telefono();
        this.nombre = obj.nombre();
        this.email = obj.email();
        this.documento = obj.documento();
        this.especialidad = obj.especialidad();
        this.direccion = new DireccionEmbedable(obj.direccion());
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public DireccionEmbedable getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionEmbedable direccion) {
        this.direccion = direccion;
    }

    public void update(MedicoPutDTO update) {
        if(update.nombre() != null){
            this.nombre = update.nombre();
        }
        
        if(update.documento()!= null){
            this.documento = update.documento();
        }
        
        if(update.direccion()!= null){
            this.direccion = this.direccion.update(update.direccion());
        }
    }

    public void desctivar() {
        this.activo = false;
    }
    
}
