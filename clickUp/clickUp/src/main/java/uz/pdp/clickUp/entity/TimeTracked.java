package uz.pdp.clickUp.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Time;
import java.sql.Timestamp;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "time_tracked")
public class TimeTracked {
    @Id
    @GeneratedValue
    private Long id;

    @CreationTimestamp
    private Timestamp startedAt;
    @CreationTimestamp
    private Timestamp stoppedAt;
    /*
    private Task task;*/
}
