package uz.pdp.clickUp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.clickUp.enums.Permission;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "work_space_permission")
public class WorkspacePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Permission permission;
/*
    private WorkspaceRole workspaceRole;*/
}
