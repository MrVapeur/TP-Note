package Organisations;

import personnes.Employe;
import personnes.Emprunteur;

import java.util.ArrayList;
import java.util.List;

public class Agence extends Emprunteur
{
    private List<Employe> employes = new ArrayList<Employe>();
    private String nom;

    public Agence(String nom)
    {
        this.nom = nom;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
