/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author steeltitanrbrn
 */
public class Achat implements Serializable {
    
    private long id;
    private LocalDate date;
    private double remise;
    private Client client;
    private Employe employe;
    private List<ProduitAchete> produitAchetes = new ArrayList<>();
    
    
    
    public Achat() {
    }

    public Achat(long id, LocalDate date, double remise) {
        this.id = id;
        this.date = date;
        this.remise = remise;
    }
    
    public Achat(long id, LocalDate date, double remise, 
            Employe employe, Client client) {
        this.id = id;
        this.date = date;
        this.remise = remise;
        this.employe = employe;
        this.client = client;
    }

    
    @Override
    public String toString() {
        return "Achat{" + "id=" + id + ", date=" + date + ", remise=" + remise + '}';
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
    public double getRemiseTotale() {
        return 0;
    }
    
    public double getTotalAPayer() {
        return 0;
    }

    public List<ProduitAchete> getProduitAchetes() {
        return produitAchetes;
    }

    public void setProduitAchetes(List<ProduitAchete> produitAchetes) {
        this.produitAchetes = produitAchetes;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Achat other = (Achat) obj;
        return this.id == other.id;
    }
}
