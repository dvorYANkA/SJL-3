package portal.classroom.services.interfaces;

import portal.classroom.model.Teacher;
import portal.classroom.services.interfaces.CrudService;

public interface TeacherService extends CrudService<Teacher, Long>
{
    Teacher findByLastName(String lastName);
}
