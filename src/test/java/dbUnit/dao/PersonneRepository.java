package dbUnit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dbUnit.beans.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long> {

}
