/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.messages;

import java.util.List;
import tg.univlome.epl.boutique.entites.ProduitAchete;

/**
 *
 * @author steeltitanunbrk
 */
public class ProduitAcheteMessage {
    
    private TypeMessage type;
    private ProduitAchete entite;
    private List<ProduitAchete> liste;

    public ProduitAcheteMessage() {
    }

    public ProduitAcheteMessage(TypeMessage type) {
        this.type = type;
    }

    public ProduitAcheteMessage(TypeMessage type, ProduitAchete entite) {
        this.type = type;
        this.entite = entite;
    }

    public ProduitAcheteMessage(TypeMessage type, List<ProduitAchete> liste) {
        this.type = type;
        this.liste = liste;
    }

    public TypeMessage getType() {
        return type;
    }

    public void setType(TypeMessage type) {
        this.type = type;
    }

    public ProduitAchete getEntite() {
        return entite;
    }

    public void setEntite(ProduitAchete entite) {
        this.entite = entite;
    }

    public List<ProduitAchete> getListe() {
        return liste;
    }

    public void setListe(List<ProduitAchete> liste) {
        this.liste = liste;
    }
    
}
