package model.service;

import model.entity.Sarbaz;
import model.repository.SarbazDB;
import model.repository.SarbazDBImpl;

import java.util.ArrayList;
import java.util.List;

public class SarbazServiceImpl implements SarbazService{
    private SarbazServiceImpl(){}
    private static SarbazServiceImpl sarbazService = new SarbazServiceImpl();
    public static SarbazServiceImpl getInstance() {
        return sarbazService;
    }
    private  SarbazDB sarbazDB;

    @Override
    public int save(Sarbaz sarbaz) {
        try {
            sarbazDB = new SarbazDBImpl();
            boolean temp = sarbazDB.save(sarbaz);
            if (temp == true)
                return 1;
            else
                return 0;
        }catch (Exception e) {
            return -1;
        }

    }

    @Override
    public int update(Sarbaz sarbaz ,int tedadMorekhasiDarkhasti) {
        try {
            sarbazDB = new SarbazDBImpl();
            if (sarbazDB.ayaMorekhasiDari(sarbaz.getId() , tedadMorekhasiDarkhasti)) {
                sarbaz.setTedadMorekhasi(sarbaz.getTedadMorekhasi() - tedadMorekhasiDarkhasti);
                sarbazDB.update(sarbaz);
                return 1;
            }
            return 0;
        }catch (Exception e) {
            return -1;
        }
    }

@Override
    public int delete(Sarbaz sarbaz) {
        try {
            sarbazDB = new SarbazDBImpl();
           return sarbazDB.delete(sarbaz);

        }catch (Exception e){
            return -1;
        }
    }

    @Override
    public List<Sarbaz> showAll() {
        try{
            sarbazDB = new SarbazDBImpl();
            return sarbazDB.showAll();
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public Sarbaz estelam(long id) {
        try {
            sarbazDB = new SarbazDBImpl();
            return sarbazDB.estelam(id);
        }catch (Exception e){
            return null;
        }
    }
}
