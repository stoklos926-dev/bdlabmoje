/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Seminarium;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author RaU7
 */
public class SeminariumDAOJdbc implements SeminariumDAO {

    private final DataSource ds;

    public SeminariumDAOJdbc() {
        com.mysql.jdbc.jdbc2.optional.MysqlDataSource mds = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
        mds.setUser("root");
        mds.setPort(6033);
        mds.setPassword("");
        mds.setDatabaseName("testdao");
        ds = mds;
    }

    @Override
    public List<Seminarium> getAll() {
        
        return null;
    }

    @Override
    public Seminarium get(int id) {
       return null; 
    }

    @Override
    public void create(Seminarium seminarium) {
        
    }

    @Override
    public void update(Seminarium seminarium) {
        
    }

    @Override
    public void delete(Seminarium seminarium) {
        
    }

    @Override
    public void clearTable() {
       
    }

   

}
