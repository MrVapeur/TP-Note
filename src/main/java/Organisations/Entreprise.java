package Organisations;

import personnes.Employe;
import personnes.Emprunteur;

import java.util.List;

public class Entreprise extends Emprunteur
{
    private List<Agence> agences;
    private List<Employe> employes;
    private String nomEntreprise;

    public Entreprise(String nom)
    {
        this.nomEntreprise = nom;
    }
}
