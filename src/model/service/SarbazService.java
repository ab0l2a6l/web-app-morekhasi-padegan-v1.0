package model.service;

import model.entity.Sarbaz;

import java.util.List;

public interface SarbazService {
    boolean save(Sarbaz sarbaz);
    int update(Sarbaz sarbaz , int tedadMorekhasiDarkhasti);
    int delete(Sarbaz sarbaz);
    List<Sarbaz> showAll();
    Sarbaz estelam(long id);
}
