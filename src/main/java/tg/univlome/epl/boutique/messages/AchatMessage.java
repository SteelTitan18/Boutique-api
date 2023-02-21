/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.messages;

import java.util.List;
import tg.univlome.epl.boutique.entites.Achat;

/**
 *
 * @author steeltitanunbrk
 */
public class AchatMessage {
    
    private TypeMessage type;
    private Achat entite;
    private List<Achat> liste;

    public AchatMessage() {
    }

    public AchatMessage(TypeMessage type) {
        this.type = type;
    }

    public AchatMessage(TypeMessage type, Achat entite) {
        this.type = type;
        this.entite = entite;
    }

    public AchatMessage(TypeMessage type, List<Achat> liste) {
        this.type = type;
        this.liste = liste;
    }

    public TypeMessage getType() {
        return type;
    }

    public void setType(TypeMessage type) {
        this.type = type;
    }

    public Achat getEntite() {
        return entite;
    }

    public void setEntite(Achat entite) {
        this.entite = entite;
    }

    public List<Achat> getListe() {
        return liste;
    }

    public void setListe(List<Achat> liste) {
        this.liste = liste;
    } 
}
