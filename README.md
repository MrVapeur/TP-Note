TP Note

*Etape 15*
public class Groupe 
{
	private List < Integer > liste = new ArrayList < Integer >() ;
	private Integer repere ;
	public Groupe ( Integer r) 
	{
		repere = r;
	}
	public void setMembre ( Integer m) 
	{
		liste .add(m);
	}
	public void afficher () 
	{
		for ( Integer membre : liste ) 
		{
			if( this.isCorrect(membre)) 
			{
				System.out.println(membre);
			}
		}
	}
	private boolean isCorrect ( Integer membre ) 
	{
		return (( membre != null ) && membre.compareTo(repere)>0);
	}
}
(pas de modif)


d) @Entity @Id


