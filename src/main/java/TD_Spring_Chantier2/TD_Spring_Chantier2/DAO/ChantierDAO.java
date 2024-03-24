package TD_Spring_Chantier2.TD_Spring_Chantier2.DAO;

import TD_Spring_Chantier2.TD_Spring_Chantier2.Model.Consommable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChantierDAO extends JpaRepository<Consommable, Integer> {
}