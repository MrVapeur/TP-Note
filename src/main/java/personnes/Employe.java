package personnes;

import Organisations.Agence;
import Organisations.Entreprise;

public class Employe extends Emprunteur
{
    private Agence agence;
    private Entreprise entreprise;

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Employe(Agence ag, Entreprise en)
    {
        this.agence = ag;
        this.entreprise = en;
    }
}
