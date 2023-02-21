/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.entites;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author steeltitanrbrn
 */
public class Employe extends Personne implements Serializable {
    
    private LocalDate dateNaissance;
    
    public Employe () {
    }
    
    public Employe(long id, String nom, String prenom, LocalDate dateNaisssance) {
        super(id, nom, prenom);
        this.dateNaissance = dateNaisssance;
    }
    
    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + "dateNaissance=" + dateNaissance + '}';
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
