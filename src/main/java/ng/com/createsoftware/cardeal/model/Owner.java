package ng.com.createsoftware.cardeal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="owners")
@Data
@AllArgsConstructor
@NoArgsConstructor
//ignore the inifinite loop btw car and owner
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Owner {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="owner")
    private List<Car> cars;

    public Owner(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
