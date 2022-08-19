
public class Item {
	
	private Phone phone;
	private double price;
	private String country;
	
	// staticka metoda ktera je urcena pro validaci neplatných a nenulové reference phone - je to velmi elegantní zpùsob
	public static Item createItem(Phone phone, double price, String country) {
		
		if(phone == null) return null;
		if(price <= 0) return null;
		//if(country != null && country.length() > 0 ) return new Item(phone, price, country);
		//return null;	
		if(country == null) return null;
		if(country.length() <= 0) return null; // nesmi byt "==" misto "<="
		
		return new Item(phone, price, country);
		
	}
	
	
	private Item(Phone phone, double price, String country) {
		this.phone = phone;
		this.price = price;
		this.country = country;
	}
	
	public String getPhoneName() {
		return phone.getName();
	}
	
	public String getPhoneColor() {
		return phone.getColor();
	}
	

	public Phone getPhone() {
		return phone;
	}

	public double getPrice() {
		return price;
	}

	public String getCountry() {
		return country;
	}
	
	public String getInfo() {
		return "Phone price: " + price + "\n" + "Country: " + country + ".";
	}

	@Override
	public String toString() {
		return "Item [phone=" + phone + ", price=" + price + ", country=" + country + "]";
	}

}
