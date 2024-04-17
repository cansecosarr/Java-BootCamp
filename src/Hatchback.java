
public class Hatchback extends Vehicle{
	
	Hatchback[] hatchlist;
	public double MonthlyPrice;
	
	Hatchback(double MonthlyPrice,String CarType,int age,int dailyprice, String[] AllowedClient,String brand,String model,String color,double rateofSale) {
		super(CarType,age, dailyprice, AllowedClient, brand, model, color, rateofSale);
		this.MonthlyPrice=30*rateofSale*dailyprice;
		
					

		}}
		

