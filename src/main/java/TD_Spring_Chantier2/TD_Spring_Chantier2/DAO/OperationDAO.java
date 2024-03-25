package TD_Spring_Chantier2.TD_Spring_Chantier2.DAO;

import TD_Spring_Chantier2.TD_Spring_Chantier2.Model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationDAO extends JpaRepository<Operation, Integer> {
}