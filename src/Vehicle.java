
public class Vehicle {
 String CarType;
 String[] AllowedClient;
 String brand;
 String model;
 String color;
 int age;
 int dailyprice;
 double rateofSale;
 Vehicle(String CarType,int age,int dailyprice, String[] AllowedClient,String brand,String model,String color,double rateofSale){
	 this.CarType=CarType;
	 this.AllowedClient=AllowedClient;;
	 this.brand=brand;
	 this.age=age;
	 this.model=model;
	 this.color=color;
	 this.dailyprice=dailyprice;
	 this.rateofSale=rateofSale;
 }
}
