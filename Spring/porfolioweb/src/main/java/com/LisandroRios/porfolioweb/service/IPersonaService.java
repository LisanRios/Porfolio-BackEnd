package com.LisandroRios.porfolioweb.service;

import com.LisandroRios.porfolioweb.model.MPersona;
import java.util.List;

public interface IPersonaService {

    //método para traer todas las personas
    public List<MPersona> getPersonas();

    //método para dar de alta una persona
    public void savePersona(MPersona perso);

    //método para borrar una persona
    public void deletePersona(Long id);

    //método para encontrar una persona
    public MPersona findPersona(Long id);

}
