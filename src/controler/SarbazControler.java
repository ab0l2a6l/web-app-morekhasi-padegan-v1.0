package controler;

import model.entity.Sarbaz;
import model.service.SarbazService;
import model.service.SarbazServiceImpl;

import java.util.List;


public class SarbazControler {
    private SarbazService sarbazService = SarbazServiceImpl.getInstance();

    public void save (Sarbaz sarbaz){
          sarbazService.save(sarbaz);
    }

    public void update (Sarbaz sarbaz, int tedadMorekhasiDarkhasti) {
         sarbazService.update(sarbaz, tedadMorekhasiDarkhasti);
    }

    public void delete (Sarbaz sarbaz){
          sarbazService.delete(sarbaz);
    }

    public List<Sarbaz> showAll(){
        return sarbazService.showAll();
    }

    public Sarbaz estelam(long id){
        return sarbazService.estelam(id);
    }
}
