/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique.messages;

import java.util.List;
import tg.univlome.epl.boutique.entites.Client;

/**
 *
 * @author steeltitanunbrk
 */
public class ClientMessage {
    
    private TypeMessage type;
    private Client entite;
    private List<Client> liste;

    public ClientMessage() {
    }

    public ClientMessage(TypeMessage type) {
        this.type = type;
    }

    public ClientMessage(TypeMessage type, Client entite) {
        this.type = type;
        this.entite = entite;
    }

    public ClientMessage(TypeMessage type, List<Client> liste) {
        this.type = type;
        this.liste = liste;
    }

    public TypeMessage getType() {
        return type;
    }

    public void setType(TypeMessage type) {
        this.type = type;
    }

    public Client getEntite() {
        return entite;
    }

    public void setEntite(Client entite) {
        this.entite = entite;
    }

    public List<Client> getListe() {
        return liste;
    }

    public void setListe(List<Client> liste) {
        this.liste = liste;
    }
    
}
