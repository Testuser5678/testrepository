import java.io.Serializable;

/**
 * Mitarbeiter.java
 * 
 * @author Kira
 */
public class Mitarbeiter implements Serializable
{
	/**
	 * Objekte dieser Klasse sind Mitarbeiter einer bestimmten Abteilung
	 * 
	 * @see Abteilung
	 */
	private int persnr;
	private String name;
	protected Abteilung arbeitetIn;
	
	
	public Mitarbeiter(String name, int persnr)
	{
		this.name = name;
		this.persnr = persnr;
	}
	
		
	public Mitarbeiter(Abteilung arbeitetIn) 
	{
		this.arbeitetIn = arbeitetIn;
	}
		

	public Mitarbeiter(int persnr, String name, Abteilung arbeitetIn) 
	{
		this.persnr = persnr;
		this.name = name;
		this.arbeitetIn = arbeitetIn;
		arbeitetIn.link(this);
	}


	public void link (Abteilung abt)
	{
		if(this.arbeitetIn != abt)
			arbeitetIn = abt;
	}
	
	
	public Abteilung getlink()
	{
		return arbeitetIn;
	}

	
	public void unlink() 
	{
		this.arbeitetIn=null;		
	}


	public int getPersnr() 
	{
		return persnr;
	}


	public void setPersnr(int persnr) 
	{
		this.persnr = persnr;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public String getArbeitetIn() 
	{
		return arbeitetIn.getBezeichnung();
	}

	
	public String toString()
	{
		return "" + this.getName() + ", Personalnummer: " + this.getPersnr() + ", Abteilung: " + this.getArbeitetIn();
		
	}
}
