package ma.marsamaroc.pfaNour.Dao;

import ma.marsamaroc.pfaNour.Beans.Navire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NavireDao extends JpaRepository<Navire , Long> {
    void deleteNavireById(Long id);
    Optional<Navire> findNavireById(Long id);
}
