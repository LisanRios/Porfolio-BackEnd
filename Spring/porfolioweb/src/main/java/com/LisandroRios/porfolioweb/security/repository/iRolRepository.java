package com.LisandroRios.porfolioweb.security.repository;

import com.LisandroRios.porfolioweb.security.entity.Rol;
import com.LisandroRios.porfolioweb.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolnombre);
}
