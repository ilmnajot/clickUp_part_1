package uz.pdp.clickUp.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import uz.pdp.clickUp.entity.component.AbstractEntity;
import uz.pdp.clickUp.entity.enums.SystemRoleName;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Set;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User extends AbstractEntity implements UserDetails {


    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(name="color")
    private String color;

    @Column(name="initial_letter")
    private String initialLetter;

    @Column(name="last_activity")
    private Timestamp lastActivity;

    @OneToOne(fetch = FetchType.LAZY)
    private Attachment avatar;

    @Enumerated(value = EnumType.STRING)
    private SystemRoleName systemRoleName;

    @Column(name = "activation_code")
    private String ActivationCode;

    @Column(nullable = false)
    private boolean enable;

    @Column(nullable = false)
    private boolean accountNonExpired = true;

    @Column(nullable = false)
    private boolean accountNonLocked = true;

    @Column(nullable = false)
    private boolean credentialsNonExpired  = true;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Set.of(new SimpleGrantedAuthority(this.systemRoleName.name()));
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }
    
    @Override
    public boolean isEnabled() {
        return this.enable;
    }
}
