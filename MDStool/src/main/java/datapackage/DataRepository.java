package datapackage;

import org.springframework.data.repository.CrudRepository;

//@Transactional
public interface DataRepository extends CrudRepository<TaggingTask, Long> {

}
