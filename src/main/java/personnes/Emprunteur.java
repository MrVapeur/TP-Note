package personnes;

import materiel.Empruntable;
import java.util.List;

public class Emprunteur
{
    private List<Empruntable> stock;

    public void ajouterAuStock(Empruntable em)
    {
        this.stock.add(em);
    }

    public List<Empruntable> listeMateriel()
    {
        return stock;
    }

    /*
    public bool perdreMateriel(Empruntable em)
    {

        return false;
    }
     */
}
