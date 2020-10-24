
public class CheeseCake extends Menu {

	public CheeseCake(String name, int rating, int quantity) {
		super(name, rating, quantity);
	}

	@Override
	public int calculateTotalPrice() {
		return this.calculateBasePrice() * this.quantity;
	}
	
	@Override
	public void describe() {
		System.out.println("FnBucks Cofee Shop");
		System.out.println("==================");
		System.out.println("Coffee Order");
		System.out.println("======================================================");
		System.out.println("|	Name	|	Rating	|	Quantity	|	TotalPrice	|");
		System.out.println("======================================================");
		System.out.println("|	" + this.name + "	|	" + this.rating + "	|	" + this.quantity + "	|	" + this.calculateTotalPrice()+ "	|");
		System.out.println("======================================================");
//		System.out.println(this.name); 
//		System.out.println(this.rating);
//		System.out.println(this.quantity);
//		System.out.println(this.calculateTotalPrice());
	}
	
}
