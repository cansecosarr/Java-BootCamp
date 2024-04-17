import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Hatchback[] hatchlist=new Hatchback[3];
		double MonthlyPrice=0;
		hatchlist[0]=new Hatchback(MonthlyPrice,"Hatchback",2023, 30,args, "Toyota", "Corolla", "Gray", 0.85) ;
		hatchlist[1]=new Hatchback(MonthlyPrice,"Hatchback",2022, 40, args, "Honda", "Civiv", "Red", 0.85);
		hatchlist[2]=new Hatchback(MonthlyPrice,"Hatchback",2021, 35, args, "Chevrolet", "Sonic","Green", 0.7);
		for (int index=0;index<3;index++) {
		 double MonthlyPrice1=hatchlist[index].rateofSale*30*hatchlist[index].dailyprice;
		 hatchlist[index].MonthlyPrice=MonthlyPrice1;}
		////////////////
		SUV[] suvlist=new SUV[3];
		suvlist[0]=new SUV(MonthlyPrice,"SUV",2024, 50, args, "Ford", "Escape", "Blue", 1);
		suvlist[1]=new SUV(MonthlyPrice,"SUV",2021, 40, args, "Hyundai","Tucson", "White", 0.8);
		suvlist[2]=new SUV(MonthlyPrice,"SUV",2022, 40, args, "Kia", "Sportage", "Red", 0.7);
		for (int index=0;index<3;index++) {
			 double MonthlyPrice1=suvlist[index].rateofSale*30*suvlist[index].dailyprice;
			 suvlist[index].MonthlyPrice=MonthlyPrice1;}
		////////////////////
		Sedan[] sedanlist=new Sedan[3];
		 sedanlist[0]=new Sedan(MonthlyPrice,"Sedan",2020, 30, args, "Toyota", "Camry", "Silver", 0.85);
		 sedanlist[1]=new Sedan(MonthlyPrice,"Sedan",2023, 35, args, "Honda", "Accord", "Black", 0.8);
		 sedanlist[2]=new Sedan(MonthlyPrice,"Sedan",2022, 30, args, "Nissan", "Altima", "White", 0.9);
			for (int index=0;index<3;index++) {
				 double MonthlyPrice1=sedanlist[index].rateofSale*30*sedanlist[index].dailyprice;
				 sedanlist[index].MonthlyPrice=MonthlyPrice1;}
		
		
		Customer customer=new Customer(null, null, null);
		System.out.println("Welcome,sir. Do you want to rent your car with your personal(1) or company(2) account? Please enter the number.");
		Scanner scanner = new Scanner(System.in);
		int answer1=scanner.nextInt();
		scanner.nextLine();
		if(answer1==1) {//Taking the informations form customer and assigning as a features of the new object.
			System.out.println("Next,we need to get your personal informations.Please enter your name and surname.");
			customer.customername=scanner.nextLine();
			System.out.println("Dear "+ customer.customername+",now we need to have your ID number:");
			customer.CustomerNum=scanner.nextLine();
			System.out.println("Finally, your phone number;");
			customer.Phone=scanner.nextLine();
			System.out.println("Now you can see all the vehicles that are ready to be served to you:");
			
			
			
			}
			
			
			
		
		if(answer1==2) {
			System.out.println("Next,we need to get your companies informations.Please enter your company name.");
			customer.customername=scanner.nextLine();
			System.out.println("Dear "+ customer.customername+",now we need to have your tax number:");
			customer.CustomerNum=scanner.nextLine();
			System.out.println("Finally, your contact number;");
			customer.Phone=scanner.nextLine();
			System.out.println("Our SUV models:");
			for (int index=0;index<3;index++) {
				System.out.println("Brand:"+suvlist[index].brand);
				System.out.println("Model:"+suvlist[index].model);
				System.out.println("Age:"+suvlist[index].age);
				System.out.println("Color:"+suvlist[index].color);
				System.out.println("Daily Price:"+suvlist[index].dailyprice);
				System.out.println("--------------------------------------");
		}}
		System.out.println("Our Hatchback models:");
		for (int index=0;index<3;index++) {
			System.out.println("Brand:"+hatchlist[index].brand);
			System.out.println("Model:"+hatchlist[index].model);
			System.out.println("Age:"+hatchlist[index].age);
			System.out.println("Color:"+hatchlist[index].color);
			System.out.println("Daily Price:"+hatchlist[index].dailyprice);
			System.out.println("Monthly Price:"+hatchlist[index].MonthlyPrice);
			System.out.println("--------------------------------------");}
		System.out.println("Our Sedan models(They are only valid for daily-renting:");
		for (int index=0;index<3;index++) {
			System.out.println("Brand:"+sedanlist[index].brand);
			System.out.println("Model:"+sedanlist[index].model);
			System.out.println("Age:"+sedanlist[index].age);
			System.out.println("Color:"+sedanlist[index].color);
			System.out.println("Daily Price:"+sedanlist[index].dailyprice);
			System.out.println("Monthly Price:"+sedanlist[index].MonthlyPrice);
			System.out.println("--------------------------------------");}
}}
