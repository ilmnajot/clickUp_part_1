package uz.pdp.clickUp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickUp.entity.component.AbstractEntity;
import uz.pdp.clickUp.enums.TaskPermission;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "category_user")
public class CategoryUser extends AbstractEntity {

    private String name;

    @Enumerated(value = EnumType.STRING)
    private TaskPermission taskPermission;
/*
    private Category category;
    private User user;*/
}
