
public class Phone {
	
	private String name;
	private String color;
	
	
	public Phone(String name, String color) {
		this.name = name;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public String getColor() {
		return color;
	}


	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + "]";
	}	

}