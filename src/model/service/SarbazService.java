package model.service;

import model.entity.Sarbaz;

import java.util.List;

public interface SarbazService {
    boolean save(Sarbaz sarbaz);
    boolean update(Sarbaz sarbaz , int tedadMorekhasiDarkhasti);
    boolean delete(Sarbaz sarbaz);
    List<Sarbaz> showAll();
    Sarbaz estelam(long id);
}
