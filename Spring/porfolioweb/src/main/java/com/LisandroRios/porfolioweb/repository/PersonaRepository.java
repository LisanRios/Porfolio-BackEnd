
package com.LisandroRios.porfolioweb.repository;

import com.LisandroRios.porfolioweb.model.MPersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <MPersona, Long>{

    
}
