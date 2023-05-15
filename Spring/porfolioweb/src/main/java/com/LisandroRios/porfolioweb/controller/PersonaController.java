
package com.LisandroRios.porfolioweb.controller;

import com.LisandroRios.porfolioweb.model.MPersona;
import com.LisandroRios.porfolioweb.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<MPersona> getPersonas() {
        
        return interPersona.getPersonas();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/personas/crear")
    public String createStudent(@RequestBody MPersona perso) {
        
        interPersona.savePersona(perso);
        //devuelve un string avisando si creo correctamente
        return "La persona fue creada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        
        interPersona.deletePersona(id);
        //devuelve un string avisando si elimino correctamente
        return "La persona fue eliminado correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("personas/editar/{id}")
    public MPersona editPersona (@PathVariable Long id, 
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("email") String nuevoEmail) {
        
        MPersona perso = interPersona.findPersona(id);
        
        perso.setEmail(nuevoEmail);
        perso.setNombre(nuevoNombre);
    
        interPersona.savePersona(perso);
        
        return perso;
    }
    
}
