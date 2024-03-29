
package com.LisandroRios.porfolioweb.service;

import com.LisandroRios.porfolioweb.model.Persona;
import java.util.List;


public interface IPersonaService {

    //método para traer todas las personas
    public List<Persona> getPersonas ();

    //método para dar de alta una persona
    public void savePersona (Persona perso);

    //método para borrar una persona
    public void deletePersona (Long id);

    //método para encontrar una persona
    public Persona findPersona (Long id);

}
