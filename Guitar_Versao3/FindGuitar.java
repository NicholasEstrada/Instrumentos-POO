package Guitar_Versao3;
import java.util.Iterator;
import java.util.List;

public class FindGuitar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		//teste pra ver se encontrou a guitarra
		
		GuitarSpec whatErinLikes = new GuitarSpec (Builder.FENDER, "Stratocastor",
				Type.ELETRIC, Wood.ALDER,Wood.ALDER,6);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println ("Erin, talvez voce goste dessas Guitarras");
		    for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
		    	Guitar guitar =  (Guitar)i.next();
		    	GuitarSpec spec = guitar.getSpec();
		    	System.out.println("Temos uma "+ guitar.getSerialNumber()+ " " + spec.getBuilder() + 
		    		" " + spec.getModel()+ " " + spec.getType()	+ " "+ spec.getnumStrings() + " cordas "
		    		+ spec.getbackWood() + " " + spec.gettopWood() + 
		    		" no tampo.\n Ela pode ser sua por apenas US$" + guitar.getPrice() + "!\n----"); 
		    }
		} else
			System.out.println ("Desculpe não temos nada para você.");
		
	}
	
	private static void initializeInventory(Inventory inventory) {
		GuitarSpec spec =  new GuitarSpec(Builder.FENDER, "Stratocastor",Type.ELETRIC , Wood.ALDER, Wood.ALDER,6);
		GuitarSpec spec1 =  new GuitarSpec(Builder.FENDER, "Stratocastor",Type.ELETRIC , Wood.ALDER, Wood.ALDER,12);
		inventory.addGuitar("V95693", 1499.95, spec);
		inventory.addGuitar("V9512", 1549.95, spec1);
	}

}
