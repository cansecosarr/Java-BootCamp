
public class Sedan extends Vehicle {
	public double MonthlyPrice;
Sedan(double MonthlyPrice,String CarType,int age,int dailyprice, String[] AllowedClient,String brand,String model,String color,double rateofSale) {
		super(CarType,age,dailyprice, AllowedClient, brand, model, color, rateofSale);
		MonthlyPrice=dailyprice*30*rateofSale;
		

		
		
		
		
	}


}
