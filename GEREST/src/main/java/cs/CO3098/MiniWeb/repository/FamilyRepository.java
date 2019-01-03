package cs.CO3098.MiniWeb.repository;

import java.util.List;
import cs.CO3098.MiniWeb.domain.Person;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public interface FamilyRepository extends CrudRepository<Person, Integer>{
	
	
	void deleteByKey(Integer deleted);
	 
    List<Person> findAllPeople();
 
    Optional<Person> findByKey(Long id);
 
    Person save(Person persisted);
}



//see : https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-part-two-crud/