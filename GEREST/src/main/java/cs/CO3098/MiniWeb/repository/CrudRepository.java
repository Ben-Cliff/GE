package cs.CO3098.MiniWeb.repository;

import java.io.Serializable;
import java.util.List;
//import java.util.Optional;
import java.util.Optional;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
 
public interface CrudRepository<T, ID extends Serializable>  extends Repository<T, ID> {

	void deleteByKey(T deleted);
	 
    List<T> findAllPeople();
     
    Optional<T> findByKey(ID id);
 
    T save(T persisted);
	
	
	
}
//see : https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-part-two-crud/