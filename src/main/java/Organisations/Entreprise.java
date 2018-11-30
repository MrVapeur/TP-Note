package Organisations;

import personnes.Employe;
import personnes.Emprunteur;

import java.util.ArrayList;
import java.util.List;

public class Entreprise extends Emprunteur
{
    private List<Agence> agences = new ArrayList<Agence>();
    private List<Employe> employes = new ArrayList<Employe>();
    private String nomEntreprise;

    public List<Agence> getAgences() {
        return agences;
    }

    public void setAgences(List<Agence> agences) {
        this.agences = agences;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public Entreprise(String nom)
    {
        this.nomEntreprise = nom;
    }
}
