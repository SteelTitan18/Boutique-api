/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.entites;

import java.io.Serializable;


/**
 *
 * @author steeltitanrbrn
 */
public class Personne implements Serializable{
    protected long id;
    protected String nom;
    protected String prenom;
    
    public Personne() {
    }

    public Personne(long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Personne other = (Personne) obj;
//        return this.id == other.id;
//    }
    
    @Override
    public int hashCode() {
       int hash = 1;
       int coef = 53;
       
       hash = (int) ((hash * coef)^this.id);
       
       return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean equals = false;
        if (obj != null) {
            if (this == obj){
                if (this.getClass() == obj.getClass()) {
                    Personne p = (Personne)obj;
                    if (this.id == p.id) {
                       equals = true; 
                    }
                }
            }
        }
        return equals;
    }
}
