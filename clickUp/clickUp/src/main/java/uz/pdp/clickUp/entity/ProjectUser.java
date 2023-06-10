package uz.pdp.clickUp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.clickUp.enums.TaskPermission;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "project_user")
public class ProjectUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private Project project;
//    private User user;

    @Enumerated(EnumType.STRING)
    private TaskPermission taskPermission;
}
