package ma.marsamaroc.pfaNour.Service;
import ma.marsamaroc.pfaNour.Exception.EnginNotFoundException;
import ma.marsamaroc.pfaNour.Beans.Engin;
import ma.marsamaroc.pfaNour.Dao.EnginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class EnginService {

    private final EnginDao enginDao;
    @Autowired
    public EnginService(EnginDao enginDao) {
        this.enginDao = enginDao;
    }

    public Engin addEngin(Engin engin){
        engin.setCode(UUID.randomUUID().toString());
        return  enginDao.save(engin);
    }

    public List<Engin> findAllEngins(){
        return enginDao.findAll();
    }
    public Engin updateEngin(Engin engin){
        return enginDao.save(engin);
    }

    public Engin findEnginById(Long id){
        return enginDao.findById(id)
                .orElseThrow(()-> new EnginNotFoundException("Engin by id "+id+" was not found"));
    }

    public void deleteEngin(Long id){
        enginDao.deleteById(id);
    }
}
