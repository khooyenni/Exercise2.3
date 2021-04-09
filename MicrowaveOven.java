package MicrowaveOvenScanner;

import java.util.Scanner;

public class MicrowaveOven {
	
	Scanner s = new Scanner (System.in);
	
	void brand() {
	System.out.println("Please enter the model and colour you want to purchase: ");
	String model = s.nextLine();
	String colour = s.nextLine();
	System.out.println("Model : " + model);
	System.out.println("Colour : " + colour);
	System.out.println();
	
	}
	
	
	void calPrice() {
		System.out.println("Buy two get 5% discount and buy three and above get 8% discount");
		System.out.println("Please enter the quantity and price of product you want to purchase");
		int quantity = s.nextInt();
		double price =s.nextDouble();
		System.out.println("Quantity : " + quantity);
		
		if(quantity == 2) {
			double totalPrice = (quantity*price) - ((quantity*price)*0.05);
			System.out.println("Discount percentage : 5%");
			System.out.printf("The total price is RM%.2f", totalPrice);
		}else if(quantity >= 3){
			double totalPrice = (quantity*price) - ((quantity*price)*0.08);	
			System.out.println("Discount percentage : 8%");
			System.out.printf("The total price is RM%.2f", totalPrice);
		}else {
			double totalPrice = (quantity*price);
			System.out.println("No discount.");
			System.out.printf("The total price is RM%.2f", totalPrice);
		}
		System.out.println();
	}
	
	void deliveryFees() {
		System.out.println("Please choose your delivery area: \n1.West Malaysia \n2.East Malayisa");
		int delivery = s.nextInt();
		System.out.println("Please enter the quantity of product you want to purchase");
		int quantity = s.nextInt();
		
		if(delivery == 1) {
			System.out.println("The delivery fee per product is RM10");
			int dprice = quantity*10;
			System.out.printf("The total delivery fee is RM" + dprice + "\n");
			System.out.println();
		}else if (delivery == 2){
			System.out.println("The delivery fee per product is RM20");
			int dprice = (quantity*20);
			System.out.printf("The total delivery fee is RM" + dprice+ "\n");	
			System.out.println();
		}
		
		
	}
	
	void paymentMethod() {
		System.out.println("Please choose type of payment method: \n1.TNG eWallet \n2.Grab Pay \n3.Credit card");
		int paymentMethod = s.nextInt();
		System.out.println("Please enter the total price of product you want to purchase");
		double price = s.nextDouble();
		System.out.println("Please enter the total delivery fee of your product");
		int delivery = s.nextInt();
		
		switch (paymentMethod) {
		case 1:
			double tngPayment = (price+delivery) - (0.06*(price+delivery));
			System.out.println("Your payment will be discounted 6%.");
			System.out.printf("Your final payment is RM%.2f\n", tngPayment );
			break;
			
		case 2:
			double grabPayment = (price+delivery) - (0.05*(price+delivery));
			System.out.println("Your payment will be discounted 5%.");
			System.out.printf("Your final payment is RM%.2f\n", grabPayment );
			break;
		
		case 3:
			double cardPayment = (price+delivery) + (0.02*(price+delivery));
			System.out.println("Your payment will be charged 2%.");
			System.out.printf("Your final payment is RM%.2f\n", cardPayment );
			break;
		}
		System.out.println();
		
	}
	
	
	void freeGift () {
		System.out.println("Please enter the quantity of product you want to purchase:");
		int quantity = s.nextInt();
		System.out.println("The quantity of product you want to purchase is " + quantity);
		
		switch (quantity) {
		case 1:
			System.out.println("Your can get a free pot!!!!");
			break;
		case 2:
			System.out.println("You can get a free pot and pan set!!!!");
			break;
		case 3:
			System.out.println("You can get a free blender, pot and pan set!!!!");
			break;
		default:
			System.out.println("You can get a free rice cooker, blender pot and pan set!!!!");
			break;
			
		}
		System.out.println();

		
	}
	
	
	

}
