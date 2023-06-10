package uz.pdp.clickUp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "work_space_user")
public class WorkspaceUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*private Workspace workspace;
    private User user;
    private WorkspaceRole workspaceRole;
    */
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp dataInvited;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp dataJoined;
}
