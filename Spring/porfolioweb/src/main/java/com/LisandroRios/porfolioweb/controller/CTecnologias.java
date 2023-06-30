package com.LisandroRios.porfolioweb.controller;

import com.LisandroRios.porfolioweb.dto.dtoTecnologia;
import com.LisandroRios.porfolioweb.entity.Tecnologia;
import com.LisandroRios.porfolioweb.security.controller.Mensaje;
import com.LisandroRios.porfolioweb.service.STecnologia;
import io.micrometer.common.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tecno")
@CrossOrigin(origins = "https://profoliofront-lisndro-rios.web.app")
public class CTecnologias {
    
    @Autowired
    STecnologia sTecnologia;

    @GetMapping("/lista")
    public ResponseEntity<List<Tecnologia>> list() {
        List<Tecnologia> list = sTecnologia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Tecnologia> getById(@PathVariable("id") int id) {
        if (!sTecnologia.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Tecnologia tecnologia = sTecnologia.getOne(id).get();
        return new ResponseEntity(tecnologia, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sTecnologia.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sTecnologia.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoTecnologia dtotec) {
        if (StringUtils.isBlank(dtotec.getNombreT())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sTecnologia.existsByNombreT(dtotec.getNombreT())) {
            return new ResponseEntity(new Mensaje("Esa tecnologia existe"), HttpStatus.BAD_REQUEST);
        }

        Tecnologia tecnologia = new Tecnologia(dtotec.getNombreT(), dtotec.getDescripcionT());
        sTecnologia.save(tecnologia);

        return new ResponseEntity(new Mensaje("Tecnologia agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoTecnologia dtotec) {
        if (!sTecnologia.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if (sTecnologia.existsByNombreT(dtotec.getNombreT()) && sTecnologia.getByNombreT(dtotec.getNombreT()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa tecnologia ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtotec.getNombreT())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Tecnologia tecnologia = sTecnologia.getOne(id).get();
        tecnologia.setNombreT(dtotec.getNombreT());
        tecnologia.setDescripcionT((dtotec.getDescripcionT()));

        sTecnologia.save(tecnologia);
        return new ResponseEntity(new Mensaje("tecnologia actualizada"), HttpStatus.OK);

    }
}