package cs.CO3098.MiniWeb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cs.CO3098.MiniWeb.domain.Person;
import cs.CO3098.MiniWeb.repository.FamilyRepository;


///NOTE DELETE FROM PERSON
public class PersonService {
	@Autowired
	private FamilyRepository accountRepository;

	public Object findAllPeople()
	{ return accountRepository.findAllPeople(); }
	
	///not exact replica 
	public Optional<Person> findByKey(Integer key)
	{ return accountRepository.findByKey(key); }
	
	public void deleteByKey(Integer p)
	{ accountRepository.deleteByKey(p);;
	}

	public void save(Person a)
	{ accountRepository.save(a);
	}



	
}
