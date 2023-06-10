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
@Entity(name = "check_list_item")
public class CheckListItem {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private boolean resolved;

/*    private CheckList checkList;
    private AssignedUser assignedUser;*/
}
