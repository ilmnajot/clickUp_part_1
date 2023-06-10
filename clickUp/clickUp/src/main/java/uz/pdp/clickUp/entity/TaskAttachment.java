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
@Entity(name = "task_attachment")
public class TaskAttachment {
    @Id
    @GeneratedValue
    private Long id;

    private boolean pinCoverImage;

//    private Attachment attachment;
//    private Task task;
}
