package materiel;

public class Empruntable
{
    private boolean limitationPretAuxAgences;
    private boolean defectueux;

    public void declarerDeffectueux()
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
