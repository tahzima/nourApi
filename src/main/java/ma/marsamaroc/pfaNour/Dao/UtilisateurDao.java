package ma.marsamaroc.pfaNour.Dao;

import ma.marsamaroc.pfaNour.Beans.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
    void deleteUtilisateurById(Long id);
    Optional<Utilisateur> findUtilisateurById(Long id);
}
