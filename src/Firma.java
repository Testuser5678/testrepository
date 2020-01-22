/**
 * Firma.java
 * 
 * @author Kira
 */

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Firma implements Serializable
{
	/**
	 * Objekte dieser Klasse repräsentieren eine Firma mit all ihren Abteilungen
	 * 
	 * @see Abteilung
	 */
	private String name;
	private String sitz;
	private Mitarbeiter chef;
	protected List<Abteilung> abteilungen;
	
		
	public Firma(String name, String sitz, Mitarbeiter chef) 
	{
		this.name = name;
		this.sitz = sitz;
		this.chef = chef;
		this.abteilungen = new LinkedList<Abteilung>();
	}

	
	public void link(Abteilung abt)
	{
		if(!abteilungen.contains(abt))
			this.abteilungen.add(abt);
		abt.link(this);
	}
	
	
	public void mitarbeiterListeDrucken()
	{
		System.out.println("Chef: " + this.chef.getName());
		for(Abteilung a: abteilungen)
			a.mitarbeiterListeDrucken();
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public String getSitz() 
	{
		return sitz;
	}
	
	
	public void setSitz(String sitz) 
	{
		this.sitz = sitz;
	}
	
	
}
