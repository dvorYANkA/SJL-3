package portal.classroom.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Teacher extends User
{
    @OneToMany
    @JoinColumn(name = "Teacher_id")
    Set<Student> listOfStudent = new HashSet<>();

    public Teacher(String firstName,String lastName, String email){
        super(firstName, lastName, email);
    }

    //TODO: link to list of subject + create Subject object;
}
