package aldeamo.project.repository;

import aldeamo.project.model.Array;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrayRepository extends JpaRepository<Array, Long> {
}
