package com.LisandroRios.porfolioweb.service;

import com.LisandroRios.porfolioweb.entity.Tecnologia;
import com.LisandroRios.porfolioweb.repository.RTecnologia;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class STecnologia {

    @Autowired
    RTecnologia rTecnologia;

    public List<Tecnologia> list() {
        return rTecnologia.findAll();
    }

    public Optional<Tecnologia> getOne(int id) {
        return rTecnologia.findById(id);
    }

    public Optional<Tecnologia> getByNombreT(String nombreT) {
        return rTecnologia.findByNombreT(nombreT);
    }

    public void save(Tecnologia tec) {
        rTecnologia.save(tec);
    }

    public void delete(int id) {
        rTecnologia.deleteById(id);
    }

    public boolean existsById(int id) {
        return rTecnologia.existsById(id);
    }

    public boolean existsByNombreT(String nombreT) {
        return rTecnologia.existsByNombreT(nombreT);
    }
}
