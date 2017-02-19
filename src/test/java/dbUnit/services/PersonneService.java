package dbUnit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dbUnit.beans.Personne;
import dbUnit.dao.PersonneRepository;

@Service
public class PersonneService {

	@Autowired
	PersonneRepository personneRepository;
	
	public void savePersonne(Personne personne) {
		personneRepository.save(personne);
	}
	
	public List<Personne> findAll() {
		return personneRepository.findAll();
	}
}
