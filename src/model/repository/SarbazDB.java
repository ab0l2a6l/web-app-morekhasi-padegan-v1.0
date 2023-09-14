package model.repository;

import model.entity.Sarbaz;

import java.util.List;

public interface SarbazDB {
    void save(Sarbaz sarbaz);
    void update(Sarbaz sarbaz);
    void delete(Sarbaz sarbaz);
    List<Sarbaz>showAll();
    Sarbaz estelam(long id);
    boolean ayaMorekhasiDari(long id, int tedad);
}
