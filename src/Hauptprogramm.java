
public class Hauptprogramm 
{

	public static void main(String[] args) 
	{
		
		Abteilung verkauf = new Abteilung("Verkauf");
		Abteilung lager = new Abteilung("Lager");
		Mitarbeiter chef = new Mitarbeiter("Chef", 1);
		Mitarbeiter ma1 = new Mitarbeiter(43, "Max Mustermann", verkauf);
		Mitarbeiter ma3 = new Mitarbeiter(57, "Tobias Test", lager);
		Mitarbeiter ma2 = new Mitarbeiter(42, "Erika Mustermann", verkauf);
		Firma edeka = new Firma("Edeka", "Bocholt", chef);
						
		edeka.link(verkauf);
		edeka.link(lager);
		
		edeka.mitarbeiterListeDrucken();
		System.out.println();
		
		verkauf.unlink(ma2);
		edeka.mitarbeiterListeDrucken();
	}

}
