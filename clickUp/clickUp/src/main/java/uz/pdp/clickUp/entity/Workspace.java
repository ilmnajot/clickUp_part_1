package uz.pdp.clickUp.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickUp.entity.component.AbstractEntity;

import java.util.UUID;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity(name = "work_space")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"workspace_name", "owner_id"}))
public class Workspace extends AbstractEntity {

    @Column(name = "workspace_name", nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @Column(name ="initila_letter", nullable = false)
    private String initialLetter;

    private UUID avatarId;

    @PrePersist
    @PreUpdate
    public void prePersistUpdate(){
        this.initialLetter = this.name.substring(0,1);
}

    public Workspace(String name, String color, String initialLetter, UUID avatarId) {
        this.name = name;
        this.color = color;
        this.initialLetter = initialLetter;
        this.avatarId = avatarId;
    }
}

