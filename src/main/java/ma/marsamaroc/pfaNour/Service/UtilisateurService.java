package ma.marsamaroc.pfaNour.Service;

import ma.marsamaroc.pfaNour.Dao.UtilisateurDao;
import ma.marsamaroc.pfaNour.Exception.UtilisateurNotFoundException;
import ma.marsamaroc.pfaNour.Beans.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    private final UtilisateurDao utilisateurDao;
    @Autowired
    public UtilisateurService(UtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }

    public Utilisateur addUtilisateur(Utilisateur utilisateur){
        return  utilisateurDao.save(utilisateur);
    }

    public List<Utilisateur> findAllUtilisateurs(){
        return utilisateurDao.findAll();
    }
    public Utilisateur updatUtilisateur(Utilisateur utilisateur){
        return utilisateurDao.save(utilisateur);
    }

    public Utilisateur findUtilisateurById(Long id){
        return utilisateurDao.findById(id)
                .orElseThrow(()-> new UtilisateurNotFoundException("Utilisateur by id "+id+" was not found"));
    }

    public void deleteUtilisateur(Long id){
        utilisateurDao.deleteById(id);
    }
}
