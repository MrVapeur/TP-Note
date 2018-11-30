package personnes;

import Organisations.Agence;
import Organisations.Entreprise;
import materiel.Empruntable;

import java.util.List;

public class Administrateur extends Employe
{
    public Administrateur(Agence ag, Entreprise en)
    {
        super(ag,en);
    }

    public boolean attribuerMateriel(Empruntable empruntable, Emprunteur emprunteur)
    {
        if (this.perdreMateriel(empruntable))
        {
            if(empruntable.isLimitationPretAuxAgences() && !(emprunteur instanceof Agence)){
                return false;
            }
            else {
                emprunteur.ajouterAuStock(empruntable);
                return true;
            }
        }
        else
            return false;
    }

    public boolean recupererMateriel(Empruntable empruntable, Emprunteur emprunteur)
    {
        if(emprunteur.perdreMateriel(empruntable))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public List<Empruntable> stockEntreprise()
    {
        return this.getEntreprise().listeMateriel();
    }

    public List<Empruntable> stockAgence()
    {
        return this.getAgence().listeMateriel();
    }

    public void transfererMateriel(Emprunteur from, Empruntable em, Emprunteur to)
    {
        if (from.perdreMateriel(em))
        {
            to.ajouterAuStock(em);
        }
    }

    public void supprimerMateriel(Empruntable em)
    {
        this.perdreMateriel(em);
        em = null;
    }
    
    public void supprimerMaterielDefectueuxEntreprise()
    {
        for (Empruntable em :this.getEntreprise().listeMateriel())
        {
            if (em.isDefectueux())
            {
                this.getEntreprise().perdreMateriel(em);
                em = null;
            }
        }
    }

    public void supprimerMaterielDefectueuxAgence()
    {
        for (Empruntable em : this.getAgence().listeMateriel())
        {
            if (em.isDefectueux())
            {
                this.getAgence().perdreMateriel(em);
                em = null;
            }
        }
    }

    public void supprimerMaterielDefectueuxDe(Emprunteur emprunteur)
    {
        for (Empruntable em : emprunteur.listeMateriel())
        {
            if (em.isDefectueux())
            {
                emprunteur.perdreMateriel(em);
                em = null;
            }
        }
    }

    
}
