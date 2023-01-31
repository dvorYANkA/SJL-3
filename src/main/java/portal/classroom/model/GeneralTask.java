package portal.classroom.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString@EqualsAndHashCode
public class GeneralTask extends BaseEntity{
    private String description;
    private String title;

    public GeneralTask(String description, String title) {
        this.description = description;
        this.title = title;
    }
}
