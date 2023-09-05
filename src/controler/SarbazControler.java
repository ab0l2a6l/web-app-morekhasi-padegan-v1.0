package controler;

import model.entity.Sarbaz;
import model.service.SarbazService;
import model.service.SarbazServiceImpl;

import java.util.List;


public class SarbazControler {
    private SarbazService sarbazService = SarbazServiceImpl.getInstance();

    public int save (Sarbaz sarbaz){
        return sarbazService.save(sarbaz);
    }

    public int update (Sarbaz sarbaz, int tedadMorekhasiDarkhasti) {
        return sarbazService.update(sarbaz, tedadMorekhasiDarkhasti);
    }

    public int delete (Sarbaz sarbaz){
        return sarbazService.delete(sarbaz);
    }

    public List<Sarbaz> showAll(){
        return sarbazService.showAll();
    }

    public Sarbaz estelam(long id){
        return sarbazService.estelam(id);
    }
}
