package dbUnit.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dbUnit.beans.Personne;
import dbUnit.dao.PersonneRepository;
import dbUnit.services.PersonneService;


//@ImportResource(value="beans.xml")
//@ContextConfiguration(locations={"classpath:/beans.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
//@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
public class PersonneTest {

	@Autowired
	PersonneService personneService;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void test() {
		Personne personne=new Personne((long) 1, "aa", "bb");
		personneService.savePersonne(personne);
		
		List<Personne> personnes=personneService.findAll();
		assertEquals(1, personnes.size());
	}

}
