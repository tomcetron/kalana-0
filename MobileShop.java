import java.util.Arrays;

public class MobileShop {
	
	public Item[] items;
	public int idx;
	

	public MobileShop() {
		items = new Item[100];
		idx = -1;
	}
	
	
    public void createNewItemInShop(Phone phone, double price, String country) {
    	Item item = Item.createItem(phone, price, country);
    	items[++idx] = item;
    }
    
    
    public String[] getAvailableCountries() {
    	String[] countries = new String[idx+1];
    	for (int i = 0; i < items.length; i++) {
			if (items[i] != null) { 
				countries[i] = items[i].getCountry();
    		}
		}
    	return countries;
    } 
    
    // vraci pole stringu mobilu dle barev
    public String[] getAvailableColors() {
    	String[] colors = new String[idx+1];
    	for (int i = 0; i < items.length; i++) {
			if (items[i] != null) { 
				colors[i] = items[i].getPhoneColor();
			}
		}
    	return colors;
    }
    
    // vraci pole polozek po zadani maximalni vysi ceny
    public Item[] getItems(double maximalPrice) {
    	int velfinPole = 0;
    	Item[] maxPrice = new Item[idx+1];
    	for (int i = 0; i < items.length; i++) {
    		if (items[i] != null && items[i].getPrice() < maximalPrice) {
    			maxPrice[i] =  items[i];
    			velfinPole++;
       		} 
    		
		}	
    	maxPrice = plnePole(maxPrice, idx+1, velfinPole);
    	return maxPrice;
    }
    
    // privatni metoda vracejici orezane pole, je pouzita na vice mistech
    private Item[] plnePole(Item[] array, int delkaPole, int velikostFinalPole) {
        Item[] orezanePole = new Item[velikostFinalPole];
        int j = 0;
        	for(int i = 0; i < delkaPole ; i++) {
        			if(array[i] != null ) {
        				orezanePole[j] = array[i];
        				j++;
        			}
        			
			} 
        	
        return orezanePole;
    }
    
    
    // metoda z bodu 7 e. , 3 kriteria
    Item[] getItems(String country, String phoneColor, double maximalPrice) {
    	Item[] returnedArray = new Item[idx+1];
    	int velfinPole = 0;
    	for (int i = 0; i < items.length; i++) {
			if( items[i] != null && items[i].getCountry().equals(country) && items[i].getPhoneColor().equals(phoneColor) && items[i].getPrice() < maximalPrice) { 
				returnedArray[i] = items[i];
				velfinPole++;
			}
    		
		}
    	returnedArray = plnePole(returnedArray, idx+1, velfinPole);
    	return returnedArray;
    }

    // posledni metoda z bodu 7 f.
    public void printArray(Item[] items) {
    	Item[] itemsArray = new Item[idx+1];
    	for (int i = 0; i < items.length; i++) {
			if(itemsArray[i] != null) {
				System.out.println(itemsArray[i]);
			}	
		}
  
    }
    
    
        
    

	@Override
	public String toString() {
		return "MobileShop [items=" + Arrays.toString(items) + ", idx=" + idx + "]";
	}


}
