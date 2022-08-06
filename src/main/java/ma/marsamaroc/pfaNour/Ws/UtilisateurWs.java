package ma.marsamaroc.pfaNour.Ws;

import ma.marsamaroc.pfaNour.Beans.Utilisateur;
import ma.marsamaroc.pfaNour.Service.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurWs {
     private final UtilisateurService utilisateurService;

    public UtilisateurWs(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Utilisateur>> getAllUtilisateurs(){
        List<Utilisateur> utilisateur = utilisateurService.findAllUtilisateurs();
        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable("id") Long id){
        Utilisateur utilisateur = utilisateurService.findUtilisateurById(id);
        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Utilisateur> addUtilisateur(@RequestBody Utilisateur utilisateur){
        Utilisateur newutilisateur = utilisateurService.addUtilisateur(utilisateur);
        return new ResponseEntity<>(newutilisateur, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Utilisateur> updateUtilisateur(@RequestBody Utilisateur utilisateur){
        Utilisateur updateutilisateur = utilisateurService.updatUtilisateur(utilisateur);
        return new ResponseEntity<>(updateutilisateur, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUtilisateur(@PathVariable("id") Long id){
        utilisateurService.deleteUtilisateur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
