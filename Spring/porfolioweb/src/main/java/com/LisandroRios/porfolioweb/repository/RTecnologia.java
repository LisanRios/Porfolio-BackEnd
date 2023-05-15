
package com.LisandroRios.porfolioweb.repository;

import com.LisandroRios.porfolioweb.entity.Tecnologia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RTecnologia extends JpaRepository<Tecnologia, Integer>{
    public Optional<Tecnologia> findByNombreT(String nombreT);
    public boolean existsByNombreT(String nombreT);
    
}
