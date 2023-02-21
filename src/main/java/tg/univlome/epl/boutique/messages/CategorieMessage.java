/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.messages;

import java.util.List;
import tg.univlome.epl.boutique.entites.Categorie;

/**
 *
 * @author steeltitanunbrk
 */
public class CategorieMessage {
    
    private TypeMessage type;
    private Categorie entite;
    private List<Categorie> liste;

    public CategorieMessage() {
    }

    public CategorieMessage(TypeMessage type) {
        this.type = type;
    }

    public CategorieMessage(TypeMessage type, Categorie entite) {
        this.type = type;
        this.entite = entite;
    }

    public CategorieMessage(TypeMessage type, List<Categorie> liste) {
        this.type = type;
        this.liste = liste;
    }

    public TypeMessage getType() {
        return type;
    }

    public void setType(TypeMessage type) {
        this.type = type;
    }

    public Categorie getEntite() {
        return entite;
    }

    public void setEntite(Categorie entite) {
        this.entite = entite;
    }

    public List<Categorie> getListe() {
        return liste;
    }

    public void setListe(List<Categorie> liste) {
        this.liste = liste;
    }
}
