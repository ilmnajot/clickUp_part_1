package uz.pdp.clickUp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "task_tag")
public class TaskTag {
    @Id
    @GeneratedValue
    private Long id;
/*
    private Task task;
    private Tag tag;*/
}
