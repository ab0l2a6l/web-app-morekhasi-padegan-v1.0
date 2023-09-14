package model.service;

import model.entity.Sarbaz;

import java.util.List;

public interface SarbazService {
    void save(Sarbaz sarbaz);
    void update(Sarbaz sarbaz , int tedadMorekhasiDarkhasti);
    void delete(Sarbaz sarbaz);
    List<Sarbaz> showAll();
    Sarbaz estelam(long id);
}
