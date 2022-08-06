package ma.marsamaroc.pfaNour.Dao;

import ma.marsamaroc.pfaNour.Beans.Engin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnginDao extends JpaRepository<Engin, Long> {
    void deleteEnginById(Long id);
    Optional<Engin> findEnginById(Long id);
}
