package portal.classroom.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString@EqualsAndHashCode(callSuper = true)
public class Student extends User
{
    @OneToMany
    @JoinColumn(name = "Student_id")
    private Set<ConcreteTask> listOfConcreteTasks = new HashSet<>();

    @ManyToOne
    private Teacher teacher;

    public Student(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    public Student(String firstName, String lastName, String email, Set<ConcreteTask> listOfConcreteTasks) {
        super(firstName, lastName, email);
        this.listOfConcreteTasks = listOfConcreteTasks;
    }
}
