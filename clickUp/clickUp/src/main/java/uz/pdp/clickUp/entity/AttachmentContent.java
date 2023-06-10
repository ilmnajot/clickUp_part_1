package uz.pdp.clickUp.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.clickUp.entity.component.AbstractEntity;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class AttachmentContent extends AbstractEntity {

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private Attachment attachment;

    @Lob
    private byte[] content;

    public AttachmentContent(Attachment attachment, byte[] content) {
        this.attachment = attachment;
        this.content = content;
    }
}
