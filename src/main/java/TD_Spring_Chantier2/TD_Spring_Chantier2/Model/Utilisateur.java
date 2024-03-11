package TD_Spring_Chantier2.TD_Spring_Chantier2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(nullable = false, unique = true)
    protected String pseudo;

    @Column(nullable = false)
    protected String motDePasse;

}
