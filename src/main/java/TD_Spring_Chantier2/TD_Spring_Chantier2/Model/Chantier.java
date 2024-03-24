package TD_Spring_Chantier2.TD_Spring_Chantier2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Chantier")
public class Chantier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "name", nullable = false)
    protected String name;

    @Column(nullable = false)
    protected String adresse;


}
