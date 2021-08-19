package be.bemoore.userservice.Model;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString

@RequiredArgsConstructor
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AppUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
