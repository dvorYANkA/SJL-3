package portal.classroom.services.interfaces;
import portal.classroom.model.Student;
import portal.classroom.services.interfaces.CrudService;

public interface StudentService extends CrudService<Student, Long>
{
    Student findByLastName(String lastName);
}
