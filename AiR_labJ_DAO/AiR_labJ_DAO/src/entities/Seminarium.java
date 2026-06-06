/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author RaU7
*/

public class Seminarium {

    private int id;
    
    private String typ;
    
    private int sala;
    
    private int liczbaUczestnikow;    

    public Seminarium(String typ, int sala, int liczbaUczestnikow) {
        this.typ = typ;
        this.sala = sala;
        this.liczbaUczestnikow = liczbaUczestnikow;
    }

    public Seminarium() {
    }

    @Override
    public String toString() {
        return "Seminarium{" + "id=" + id + ", typ=" + typ + ", sala=" + sala + ", liczbaUczestnikow=" + liczbaUczestnikow + '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getLiczbaUczestnikow() {
        return liczbaUczestnikow;
    }

    public void setLiczbaUczestnikow(int liczbaUczestnikow) {
        this.liczbaUczestnikow = liczbaUczestnikow;
    }

   

      
    
}
