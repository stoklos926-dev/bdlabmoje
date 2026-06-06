/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Seminarium;
import java.util.List;

/**
 *
 * @author RaU7
 */
public interface SeminariumDAO {

 //Zwraca listę wszystkich seminariów
    List<Seminarium> getAll();

//Zwraca seminarium o podanym id
    Seminarium get(int id);

//Wstawia do bazy nowe seminarium
    void create(Seminarium seminarium);

//Aktualizuje seminarium
    void update(Seminarium seminarium);

//Usuwa seminarium
    void delete(Seminarium seminarium);
    
//czyści tabelę
    void clearTable();    

}
