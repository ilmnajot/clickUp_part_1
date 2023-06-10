package uz.pdp.clickUp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.clickUp.enums.StatusType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;

    @Enumerated(value = EnumType.STRING)
    private StatusType statusType;
/*
    private Category category;
    private Space space;
    private Project project;*/
}
