import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		
		MobileShop mosho = new MobileShop();
		// naplòování dat
		mosho.createNewItemInShop(null, -1200.48, "");
		mosho.createNewItemInShop(new Phone("iPhone7", "white"), 1050.90, "Germany");
		mosho.createNewItemInShop(new Phone("Samsung wave", "grey"), 800.90, "Alaska");
		mosho.createNewItemInShop(new Phone("Ericsson", "black"), 600.54, "Ireland");
		mosho.createNewItemInShop(new Phone("Alcatel", "red"), 250.8, "Sweden");
		mosho.createNewItemInShop(new Phone("Nokia", "white"), 150.35, "Finland");
		mosho.createNewItemInShop(new Phone("Huawei", "grey"), 99.54, "Norway");
		mosho.createNewItemInShop(new Phone("iPhone13 mini", "pink"), 699, "UK");
		
		// vytahuje seznam Zemi
		System.out.println("DOSTUPNE ZEME:");
		String[] seznamZemi = mosho.getAvailableCountries();
		System.out.println(Arrays.toString(seznamZemi));
		
		System.out.println("--------------");
		// vraci mobil dle zvolene barvy
		System.out.println("DOSTANE MOBIL DLE BARVY:");
		String[] danaBarva = mosho.getAvailableColors();
		System.out.println(Arrays.toString(danaBarva));
		
		System.out.println("----------------");
		// vraci telefony s max. cenovou hodnotou za mobil	
		System.out.println("VRACI POLOZKU DO URCITE CENOVE VYSE:");
		Item[] maxPrice = mosho.getItems(100.00);
		System.out.println(Arrays.toString(maxPrice));
		
		System.out.println("--------------");	
		// vraci vybranou Zemi, barvu telefonu a maximalni pozadovanou cenu
		System.out.println("VRACI POLOZKU DLE ZADANYCH TRI KRITERII: ZEME, BARVA MOBILU A CENA:");
		Item[] triKriteria = mosho.getItems("USA", "black", 1201.00);
		System.out.println(Arrays.toString(triKriteria));
		
		System.out.println("--------------");
		// posledni metoda 7.f
		System.out.println("VRACI VLOZENE POLE TYPU ITEM:");
		Item[] whatever = maxPrice;
		System.out.println(Arrays.toString(whatever));
		
		System.out.println("--------------");
		Item item = Item.createItem(new Phone("iPhone5","black"), 567.56, "GB");
		
		System.out.println(item.getInfo());

	}

}
