package model.repository;

import model.entity.Sarbaz;

import java.util.List;

public interface SarbazDB {
    boolean save(Sarbaz sarbaz);
    boolean update(Sarbaz sarbaz);
    boolean delete(Sarbaz sarbaz);
    List<Sarbaz>showAll();
    Sarbaz estelam(long id);
    boolean ayaMorekhasiDari(long id, int tedad);
}
