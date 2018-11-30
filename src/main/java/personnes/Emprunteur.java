package personnes;

import materiel.Empruntable;

import java.util.Iterator;
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

    public boolean perdreMateriel(Empruntable em)
    {
        return this.stock.remove(em);
    }
}
