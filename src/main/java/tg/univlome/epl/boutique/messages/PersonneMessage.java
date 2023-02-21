/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.messages;

import java.util.List;
import tg.univlome.epl.boutique.entites.Personne;

/**
 *
 * @author steeltitanunbrk
 */
public class PersonneMessage {
    
    private TypeMessage type;
    private Personne entite;
    private List<Personne> liste;

    public PersonneMessage() {
    }

    public PersonneMessage(TypeMessage type) {
        this.type = type;
    }   

    public PersonneMessage(TypeMessage type, Personne entite) {
        this.type = type;
        this.entite = entite;
    }

    public PersonneMessage(TypeMessage type, List<Personne> liste) {
        this.type = type;
        this.liste = liste;
    }

    public TypeMessage getType() {
        return type;
    }

    public void setType(TypeMessage type) {
        this.type = type;
    }

    public Personne getEntite() {
        return entite;
    }

    public void setEntite(Personne entite) {
        this.entite = entite;
    }

    public List<Personne> getListe() {
        return liste;
    }

    public void setListe(List<Personne> liste) {
        this.liste = liste;
    }
    
}
