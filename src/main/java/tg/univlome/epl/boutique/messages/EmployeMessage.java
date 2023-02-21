/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.messages;

import java.util.List;
import tg.univlome.epl.boutique.entites.Employe;

/**
 *
 * @author steeltitanunbrk
 */
public class EmployeMessage {
    
    private TypeMessage type;
    private Employe entite;
    private List<Employe> liste;

    public EmployeMessage() {
    }

    public EmployeMessage(TypeMessage type) {
        this.type = type;
    }

    public EmployeMessage(TypeMessage type, Employe entite) {
        this.type = type;
        this.entite = entite;
    }

    public EmployeMessage(TypeMessage type, List<Employe> liste) {
        this.type = type;
        this.liste = liste;
    }

    public TypeMessage getType() {
        return type;
    }

    public void setType(TypeMessage type) {
        this.type = type;
    }

    public Employe getEntite() {
        return entite;
    }

    public void setEntite(Employe entite) {
        this.entite = entite;
    }

    public List<Employe> getListe() {
        return liste;
    }

    public void setListe(List<Employe> liste) {
        this.liste = liste;
    }  
    
}
