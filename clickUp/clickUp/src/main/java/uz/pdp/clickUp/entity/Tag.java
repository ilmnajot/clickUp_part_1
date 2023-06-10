package uz.pdp.clickUp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "tag")
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String color;

    /*
    private Workspace workspace;
*/}
