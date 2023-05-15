package com.LisandroRios.porfolioweb.service;

import com.LisandroRios.porfolioweb.model.MPersona;
import com.LisandroRios.porfolioweb.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<MPersona> getPersonas() {
        List<MPersona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(MPersona perso) {
        persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public MPersona findPersona(Long id) {
        MPersona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }

}
