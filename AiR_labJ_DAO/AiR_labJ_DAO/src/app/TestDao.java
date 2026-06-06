/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.SeminariumDAOJdbc;
import java.util.List;
import entities.Seminarium;
import dao.SeminariumDAO;

/**
 *
 * @author RaU7
 */
public class TestDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeminariumDAO seminarimDAO = new SeminariumDAOJdbc();
        seminarimDAO.clearTable();
        for (int i = 0; i < 5; i++) {
            Seminarium seminarium = new Seminarium("mag_"+i,(120+i),(10*i));
            seminarimDAO.create(seminarium);
        }
        
        List<Seminarium> seminaria = seminarimDAO.getAll();
        seminaria.forEach(System.out::println);
        
        seminarimDAO.delete(seminaria.get(0));
        Seminarium seminarium = seminaria.get(1);
        seminarium.setSala(131);
        seminarimDAO.update(seminarium);
        
        //inne testy
       
    }
    
}
