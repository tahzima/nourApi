package ma.marsamaroc.pfaNour.Service;

import ma.marsamaroc.pfaNour.Exception.NavireNotFoundException;
import ma.marsamaroc.pfaNour.Beans.Navire;
import ma.marsamaroc.pfaNour.Dao.NavireDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NavireService {
    private final NavireDao navireDao;
    @Autowired
    public NavireService(NavireDao navireDao) {
        this.navireDao = navireDao;
    }

    public Navire addNavire(Navire navire){
        navire.setNumeroNavire(UUID.randomUUID().toString());
        return  navireDao.save(navire);
    }

    public List<Navire> findAllNavires(){
        return navireDao.findAll();
    }
    public Navire updateNavire(Navire navire){
        return navireDao.save(navire);
    }

    public Navire findNavireById(Long id){
        return navireDao.findById(id)
                .orElseThrow(()-> new NavireNotFoundException("Navire by id "+id+" was not found"));
    }

    public void deleteNavire(Long id){
        navireDao.deleteById(id);
    }
}
