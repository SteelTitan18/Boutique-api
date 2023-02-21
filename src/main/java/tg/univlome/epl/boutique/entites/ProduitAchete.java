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
public class ProduitAchete implements Serializable {

    private Achat achat;
    private Produit produit;
    private double remise;

    public ProduitAchete() {
    }

    public ProduitAchete(Achat achat, Produit produit, double remise) {
        this.achat = achat;
        this.produit = produit;
        this.remise = remise;
    }

    @Override
    public String toString() {
        return "ProduitAchete{" + "achat=" + achat + ", produit =" + produit + ", remise=" + remise + '}';
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }
}
