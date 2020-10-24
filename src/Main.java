import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		String menuEntered = enterMainMenu();
		
		redirectMenu(menuEntered);
	}
	
	private void redirectMenu(String menuEntered) {
		//1. membuat coffee atau cheesecake
		//2. deskripsi isi / atribut object 
		Menu newMenu;
		if(menuEntered.equals("Coffee")) {
			newMenu = createCoffee();
		}
		else {
			newMenu = createCheeseCake();
		}
		newMenu.describe();
		
	}
	
	private Menu createCoffee() {
		// membuat object coffee
		String name = getInputtedName();
		String size = getInputtedSize();
		String type = getInputtedType();
		int rating = getInputtedRating();
		int quantity = getInputtedQuantity();
		System.out.println("Order Coffee Success!");
		return new Coffee(name, rating, quantity, size, type);
	}
	
	private Menu createCheeseCake() {
		//membuat object cheesecake
		String name = getInputtedName();
		int rating = getInputtedRating();
		int quantity = getInputtedQuantity();
		System.out.println("Order Cake Success!");
		return new CheeseCake(name, rating, quantity);
	}
	
	private String getInputtedName() {
		String inputtedName = "";
		do {
			System.out.println("Input odername [5..20 characters]: ");
			inputtedName = scan.nextLine();
		} while ((inputtedName.length() <5 || inputtedName.length() > 20)
					|| !containsAlphabetOnly(inputtedName));
		
		return inputtedName;
	}
	
	private boolean containsAlphabetOnly(String input){
		//1. jawabarin 1 per 1 karakter
		//2. cek karakter alphabet bukan
		//3. jika iya lanjutkan ceknya
		//4. jika tidak return false(bukan alphabet doang)
		
		for (char c : input.toCharArray()) {
			if(!Character.isAlphabetic(c)) return false;
		}
		
		return true;
	}
	
	private String getInputtedSize() {
		String inputtedSize = "";
		do {
			System.out.println("Input order size [Small | Medium | Large]: ");
			inputtedSize  = scan.nextLine();
		} while (!inputtedSize.equals("Small") && !inputtedSize.equals("Medium") && !inputtedSize.equals("Large"));
		
		return inputtedSize;
	}
	
	private String getInputtedType() {
		String inputtedType = "";
		do {
			System.out.println("Input order type [Cold | Hot]: ");
			inputtedType = scan.nextLine();
		} while (!inputtedType.equals("Cold") && !inputtedType.equals("Hot"));
		
		return inputtedType;
	}
	
	private int getInputtedRating() {
		int inputtedRating = 0;
		do {
			System.out.println("Input order rating [1..4]: ");
			try {
				inputtedRating = scan.nextInt();
			} catch (Exception e) {
				inputtedRating = 0;
			}
			scan.nextLine();
		} while (inputtedRating < 1  || inputtedRating > 4);
		
		return inputtedRating;
	}
	
	private int getInputtedQuantity() {
		int inputtedQuantity = 0;
		do {
			System.out.println("Input order quantity : ");
			try {
				inputtedQuantity = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				inputtedQuantity = 0;
			}
			scan.nextLine();
		} while (inputtedQuantity < 1);
		
		return inputtedQuantity;
	}
	
	private String enterMainMenu() {
		System.out.println("FnBucks Cofee Shop");
		System.out.println("==================");
		
		String inputMenu = "";
		do {
			System.out.println("Choose menu you want to order [Coffee | Cheese Cake]: ");
			inputMenu = scan.nextLine();
		} while (!inputMenu.equals("Coffee") && !inputMenu.equals("Cheese Cake"));
		
		return inputMenu;
		
	}
	
	
	public static void main(String[] args) {
		new Main();

	}

}
