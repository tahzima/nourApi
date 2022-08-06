package ma.marsamaroc.pfaNour.Ws;

import ma.marsamaroc.pfaNour.Beans.Engin;
import ma.marsamaroc.pfaNour.Service.EnginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/engin")
public class EnginWs {
    private final EnginService enginService;
    public EnginWs(EnginService enginService) {
        this.enginService = enginService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Engin>> getAllEngins(){
        List<Engin> engins = enginService.findAllEngins();
        return new ResponseEntity<>(engins, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Engin> getEnginById(@PathVariable("id") Long id){
        Engin engin = enginService.findEnginById(id);
        return new ResponseEntity<>(engin, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Engin> addEngin(@RequestBody Engin engin){
        Engin newengin = enginService.addEngin(engin);
        return new ResponseEntity<>(newengin, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Engin> updateNavire(@RequestBody Engin engin){
        Engin updateEngin = enginService.updateEngin(engin);
        return new ResponseEntity<>(updateEngin, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEngin(@PathVariable("id") Long id){
        enginService.deleteEngin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
