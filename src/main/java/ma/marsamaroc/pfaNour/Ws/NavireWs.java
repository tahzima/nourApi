package ma.marsamaroc.pfaNour.Ws;

import ma.marsamaroc.pfaNour.Beans.Navire;
import ma.marsamaroc.pfaNour.Service.NavireService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/navire")
public class NavireWs {
    private final NavireService navireService;

    public NavireWs(NavireService navireService) {
        this.navireService = navireService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Navire>> getAllNavires(){
        List<Navire> navires = navireService.findAllNavires();
        return new ResponseEntity<>(navires, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Navire> getNavireById(@PathVariable("id") Long id){
        Navire navire = navireService.findNavireById(id);
        return new ResponseEntity<>(navire, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Navire> addNavire(@RequestBody Navire navire){
        Navire newnavire = navireService.addNavire(navire);
        return new ResponseEntity<>(newnavire, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Navire> updateNavire(@RequestBody Navire navire){
        Navire updatenavire = navireService.updateNavire(navire);
        return new ResponseEntity<>(updatenavire, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteNavire(@PathVariable("id") Long id){
        navireService.deleteNavire(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
