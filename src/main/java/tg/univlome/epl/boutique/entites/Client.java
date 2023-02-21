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
public class Client extends Personne implements Serializable {
    
    public Client(){
        
    }
    
    public Client(long id, String nom, String prenom) {
        super(id, nom, prenom);
    }
    
    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
}
