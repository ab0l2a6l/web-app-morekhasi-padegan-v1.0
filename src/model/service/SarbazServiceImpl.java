package model.service;

import model.command.WrapperClass;
import model.entity.Sarbaz;
import model.repository.SarbazDB;
import model.repository.SarbazDBImpl;

import java.util.List;

public class SarbazServiceImpl implements SarbazService{
    private SarbazServiceImpl(){}
    private static SarbazServiceImpl sarbazService = new SarbazServiceImpl();
    public static SarbazServiceImpl getInstance() {
        return sarbazService;
    }
    private  SarbazDB sarbazDB;

    @Override
    public void save(Sarbaz sarbaz) {
        try {
            sarbazDB = new SarbazDBImpl();
            sarbazDB.save(sarbaz);

        }catch (Exception e) {
            WrapperClass.getError(e);
        }

    }

    @Override
    public void update(Sarbaz sarbaz ,int tedadMorekhasiDarkhasti) {
        try {
            sarbazDB = new SarbazDBImpl();
            if (sarbazDB.ayaMorekhasiDari(sarbaz.getId() , tedadMorekhasiDarkhasti)) {
                sarbaz.setTedadMorekhasi(sarbaz.getTedadMorekhasi() - tedadMorekhasiDarkhasti);
                sarbazDB.update(sarbaz);

            }

        }catch (Exception e) {
            WrapperClass.getError(e);
        }
    }

@Override
    public void delete(Sarbaz sarbaz) {
        try {
            sarbazDB = new SarbazDBImpl();
            sarbazDB.delete(sarbaz);

        }catch (Exception e){
            WrapperClass.getError(e);
        }
    }

    @Override
    public List<Sarbaz> showAll() {
        try{
            sarbazDB = new SarbazDBImpl();
            return sarbazDB.showAll();
        }catch (Exception e){
            WrapperClass.getError(e);
        }
        return null;
    }

    @Override
    public Sarbaz estelam(long id) {
        try {
            sarbazDB = new SarbazDBImpl();
            return sarbazDB.estelam(id);
        }catch (Exception e){
            WrapperClass.getError(e);
        }
        return null;
    }
}
