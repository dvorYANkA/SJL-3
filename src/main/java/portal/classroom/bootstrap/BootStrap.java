package portal.classroom.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import portal.classroom.model.Student;
import portal.classroom.model.GeneralTask;
import portal.classroom.model.Teacher;
import portal.classroom.repository.TaskRepository;
import portal.classroom.repository.StudentRepository;
import portal.classroom.repository.TeacherRepository;

@Component
public class BootStrap implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final TaskRepository taskRepository;
    private final TeacherRepository teacherRepository;

    public BootStrap(StudentRepository studentRepository,
                     TaskRepository taskRepository,
                     TeacherRepository teacherRepository) {
        this.studentRepository = studentRepository;
        this.taskRepository = taskRepository;
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in bootstrap");

        GeneralTask taskGeneral1 = new GeneralTask("descriptionOfTask1", "someTitle1");
        GeneralTask taskGeneral2 = new GeneralTask("descriptionOfTask2", "someTitle2");
        GeneralTask taskGeneral3 = new GeneralTask("descriptionOfTask3", "someTitle3");

        taskRepository.save(taskGeneral1);
        taskRepository.save(taskGeneral2);
        taskRepository.save(taskGeneral3);

        Student student1 = new Student("Ann", "Samoylova", "test@gmail.com");
        Student student2 = new Student("Artem", "Bazilev", "test@gmail.com");
        Student student3 = new Student("Artem", "SecondName2","test@gmail.com");
        Student student4 = new Student("Illia", "SecondName3","test@gmail.com");
        Student student5 = new Student("Daria", "SecondName4", "test@gmail.com");
        Student student6 = new Student("Daria", "SecondName5", "test@gmail.com");
        Student student7 = new Student("Maxim", "Petrenko", "test@gmail.com");
        Student student8 = new Student("Maxim", "SecondName7" , "test@gmail.com");
        Student student9 = new Student("New girl", "New girl", "test@gmail.com");
        Student student10 = new Student("Kate", "Tolmacheva", "test@gmail.com");
        Student student11 = new Student("Sonya", "SecondName8", "test@gmail.com");
        Student student12 = new Student("Eva", "SecondName9", "test@gmail.com");

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);
        studentRepository.save(student5);
        studentRepository.save(student6);
        studentRepository.save(student7);
        studentRepository.save(student8);
        studentRepository.save(student9);
        studentRepository.save(student10);
        studentRepository.save(student11);
        studentRepository.save(student12);

        Teacher teacher1 = new Teacher("Yana", "Tereshchenko", "");
        Teacher teacher2 = new Teacher("Alice", "Kuznetsova", "");
        Teacher teacher3 = new Teacher("SmbElse", "SoLazyToday", "");

        teacherRepository.save(teacher1);
        teacherRepository.save(teacher2);
        teacherRepository.save(teacher3);

        System.out.println("Tasks " + taskRepository.count());
        System.out.println("Teachers " + teacherRepository.count());
    }
}
