package materiel;

public class Empruntable
{
    private boolean limitationPretAuxAgences;
    private boolean defectueux;

    public Empruntable(boolean limit)
    {
        this.limitationPretAuxAgences = limit;
    }

    public Empruntable()
    {
        this.limitationPretAuxAgences = false;
    }

    public void declarerDefectueux()
    {
        this.defectueux = true;
    }

    public boolean isDefectueux()
    {
        return this.defectueux;
    }

    public boolean isLimitationPretAuxAgences()
    {
        return limitationPretAuxAgences;
    }

    public void setLimitationPretAuxAgences(boolean limitationPretAuxAgences)
    {
        this.limitationPretAuxAgences = limitationPretAuxAgences;
    }
}
