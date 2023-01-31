package portal.classroom.services.implementations;

import org.springframework.stereotype.Service;
import portal.classroom.model.Student;
import portal.classroom.repository.StudentRepository;
import portal.classroom.services.interfaces.StudentService;

import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {
    StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
    }

    @Override
    public Set<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long aLong) {
        return null;
    }

    @Override
    public Student save(Student object) {
        return null;
    }

    @Override
    public void delete(Student object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Student findByLastName(String lastName) {
        return null;
    }
}
