/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.repaso.rest.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kedwin
 */
public interface MedicoRepositories extends JpaRepository<MedicoEntity, Long>{

    public Page<MedicoEntity> findByActivoTrue(Pageable pag);
    
}
