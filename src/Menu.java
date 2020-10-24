//prinsip encapsulation
//1. data hiding
//2. pasang setter getter(lihat kebutuhan)
public abstract class Menu {
	protected String name;
	protected int rating;
	protected int quantity;
	
	public Menu(String name, int rating, int quantity) {
		this.name = name;
		this.rating = rating;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	//perhitungan base price
	protected int calculateBasePrice() {
		return this.rating * 10000;
	}
	
	// perhitungan total price
	public abstract int calculateTotalPrice();
	public abstract void describe();
	
}
