package com.LisandroRios.porfolioweb.security.service;

import com.LisandroRios.porfolioweb.security.entity.Rol;
import com.LisandroRios.porfolioweb.security.enums.RolNombre;
import com.LisandroRios.porfolioweb.security.repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {

        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {

        irolRepository.save(rol);
    }

}
