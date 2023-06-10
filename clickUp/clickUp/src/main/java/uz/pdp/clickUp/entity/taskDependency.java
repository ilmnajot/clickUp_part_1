package uz.pdp.clickUp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.clickUp.enums.DependencyType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "task_dependecy")
public class taskDependency {
    @Id
    @GeneratedValue
    private Long id;
    private Integer taskDependencyId;

    @Enumerated(value = EnumType.STRING)
    private DependencyType dependencyType;
/*
    private Task task;*/
}
