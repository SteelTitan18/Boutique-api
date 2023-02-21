/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.messages;

import java.io.Serializable;
import java.util.List;
import tg.univlome.epl.boutique.entites.Produit;

/**
 *
 * @author steeltitanunbrk
 */
public class ProduitMessage implements Serializable {
    
    private TypeMessage type;
    private Produit entite;
    private List<Produit> liste;

    public ProduitMessage() {
    }

    public ProduitMessage(TypeMessage type) {
        this.type = type;
    }

    public ProduitMessage(TypeMessage type, Produit entite) {
        this.type = type;
        this.entite = entite;
    }

    public ProduitMessage(TypeMessage type, List<Produit> liste) {
        this.type = type;
        this.liste = liste;
    }

    public TypeMessage getType() {
        return type;
    }

    public void setType(TypeMessage type) {
        this.type = type;
    }

    public Produit getEntite() {
        return entite;
    }

    public void setEntite(Produit entite) {
        this.entite = entite;
    }

    public List<Produit> getListe() {
        return liste;
    }

    public void setListe(List<Produit> liste) {
        this.liste = liste;
    }

    @Override
    public String toString() {
        return "ProduitMessage{" + "type=" + type + ", entite=" + entite + ", liste=" + liste + '}';
    }
}
