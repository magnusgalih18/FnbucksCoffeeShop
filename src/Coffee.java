
public class Coffee extends Menu {
	private String size;
	private String type;
	
	public Coffee(String name, int rating, int quantity, String size, String type) {
		super(name, rating, quantity);
		this.size = size;
		this.type = type;		
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//perhitungan sizeprice
	private int calculateSizePrize() {
		return this.getSizeNumber() * 5000;
	}
	
	//mendapatkan size number berdassarkan size yang diinput
	private int getSizeNumber() {
		if(this.size.equals("Small"))
			return 1;
		else if(this.size.equals("Medium"))
			return 2;
		else
			return 3;
	}

	@Override
	public int calculateTotalPrice() {
		return (this.calculateBasePrice() + this.calculateSizePrize()) * this.quantity;
	}
	
	@Override
	public void describe() {
		System.out.println("FnBucks Cofee Shop");
		System.out.println("==================");
		System.out.println("Coffee Order");
		System.out.println("======================================================");
		System.out.println("|	Name	|	Size	|	Type	|	Rating	|	Quantity	|	TotalPrice	|");
		System.out.println("======================================================");
		System.out.println("|	" + this.name + "	|	" + this.size + "	|	" + this.type + "	|	" + this.rating + "	|	" + this.quantity + "	|	" + this.calculateTotalPrice()+ "	|");
		System.out.println("======================================================");
//		System.out.println(this.name); 
//		System.out.println(this.size);
//		System.out.println(this.type);
//		System.out.println(this.rating);
//		System.out.println(this.quantity);
//		System.out.println(this.calculateTotalPrice());
	}
	
	
}
