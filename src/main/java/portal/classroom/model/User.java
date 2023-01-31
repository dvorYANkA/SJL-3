package portal.classroom.model;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class
User extends BaseEntity
{
    String firstName = "";
    String lastName = "";
    String email = "";

}