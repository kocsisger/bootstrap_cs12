package hu.unideb.inf.bootstrap;

import hu.unideb.inf.bootstrap.model.Person;
import hu.unideb.inf.bootstrap.model.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace =
		AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
class BootstrapApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
		Person p = Person.builder()
				.id(10)
				.firstName("Winch")
				.lastName("Eszter")
				.email("we@example.com")
				.password("alma123")
				.enabled(false)
				.build();

		personRepository.save(p);
	}

}
