package com.portfolio.portfolioBackEnd.Interface;

import com.portfolio.portfolioBackEnd.Entity.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {

public List<Persona> getPersona();

public void savePersona(Persona persona);

public void deletePersona(Long id);

public Persona findPersona(Long id);

}

