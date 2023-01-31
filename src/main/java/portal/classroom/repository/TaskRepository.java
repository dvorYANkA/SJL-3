package portal.classroom.repository;
import portal.classroom.model.GeneralTask;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<GeneralTask, Long> {
}
