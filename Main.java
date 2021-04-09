package MicrowaveOvenScanner;

public class Main {

	public static void main(String[] args) {
		
		MicrowaveOven Panasonic = new MicrowaveOven();
		MicrowaveOven Sharp = new MicrowaveOven();
		MicrowaveOven Samsung = new MicrowaveOven();
		MicrowaveOven Toshiba = new MicrowaveOven();
		
		System.out.println("*****PANASONIC*****");
		Panasonic.brand();
		Panasonic.calPrice();
		Panasonic.deliveryFees();
		Panasonic.paymentMethod();
		Panasonic.freeGift();
		
		System.out.println("*****SHARP*****");
		Sharp.brand();
		Sharp.calPrice();
		Sharp.deliveryFees();
		Sharp.paymentMethod();
		Sharp.freeGift();
		
		System.out.println("*****SAMSUNG*****");
		Samsung.brand();
		Samsung.calPrice();
		Samsung.deliveryFees();
		Samsung.paymentMethod();
		Samsung.freeGift();
		
		System.out.println("*****TOSIBA*****");
		Toshiba.brand();
		Toshiba.calPrice();
		Toshiba.deliveryFees();
		Toshiba.paymentMethod();
		Toshiba.freeGift();
		
		
		
	}

}
