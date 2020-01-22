/**
 * Abteilung.java
 * 
 * @author Kira
 */

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Abteilung implements Serializable
{
	/**
	 * Objekte der Klasse Abteilung repräsentieren eine Abteilung einer Firma
	 * und enthalten eine Liste ihrer Mitarbeiter
	 * 
	 * @see Firma
	 * @see Mitarbeiter
	 */
	protected List<Mitarbeiter> ma; // verwaltet eine Liste von Referenzen auf Mitarbeiter-Objekte
	String bezeichnung;
	Firma firma;
	
	Abteilung()
	{
		this.ma = new LinkedList<Mitarbeiter>();
	}
	
	Abteilung(String bezeichnung)
	{
		this();
		this.bezeichnung = bezeichnung;
	}
	
	
	public void mitarbeiterListeDrucken()
	{
		for(Mitarbeiter m: ma)
			System.out.println(m.toString());
	}
	
	
	public void link (Firma f)
	{
		if(this.firma != f)
			this.firma = f;
	}
	
	
	public void unlink (Firma f)
	{
		this.firma = null;
	}
	
	public void link (Mitarbeiter mit)
	{
		if(!ma.contains(mit))
			this.ma.add(mit);
		mit.link(this);
	}
	
	public void unlink (Mitarbeiter mit)
	{
		this.ma.remove(mit);
		mit.unlink();
	}
	
	Mitarbeiter getlink (int pos)
	{
		return this.ma.get(pos);
	}

	public String getBezeichnung() 
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) 
	{
		this.bezeichnung = bezeichnung;
	}
}
