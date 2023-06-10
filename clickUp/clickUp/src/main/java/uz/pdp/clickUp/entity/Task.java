package uz.pdp.clickUp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "task")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @CreationTimestamp
    private Timestamp startedDate;

    @CreationTimestamp
    private Timestamp startTimeHas;

    @CreationTimestamp
    private Timestamp dueDate;

    @CreationTimestamp
    private Timestamp dueTimeHas;

    private long estimatedTime;

    private boolean activatedTime;
/*
    private Status status;
    private Category category;
    private Priority priority;
    private long parentTaskId;*/
}
