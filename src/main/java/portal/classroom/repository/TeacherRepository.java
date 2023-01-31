package portal.classroom.repository;

import org.springframework.data.repository.CrudRepository;
import portal.classroom.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {

}
