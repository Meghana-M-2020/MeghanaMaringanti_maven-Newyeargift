package com.hometask2;
import java.util.*;
public class NewGift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,total_weight=0,DairyMilk_weight=180,Khova_weight=90,Kitkat_weight=60,Snickers_weight=100,Khalakand_weight=40,Gulabjamun_weight=20,quantity;
		char addmore;
		boolean flag=true;
		Newyeargiftbox1 object;
		HashMap<String, Integer> mygiftbox = new HashMap<>();
		Scanner scanner_object = new Scanner(System.in);
		System.out.println("Select items in your giftbox : ");
		while(flag) {
		System.out.println("1.DairyMilk\n 2.Khova\n 3.Kitkat\n 4.Snickers\n 5.Khalakand\n 6.Gulabjamun\n Enter your choice");
		choice=scanner_object.nextInt();
		System.out.println(choice);
		switch(choice) {
		case 1:
		System.out.println("Enter DairyMilk units : ");
		quantity=scanner_object.nextInt();
		object=new DairyMilk();
		total_weight += object.calculate_weight(DairyMilk_weight,quantity);
		mygiftbox.put("DairyMilk", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 2:
		System.out.println("Enter Khova units : ");
		quantity=scanner_object.nextInt();
		object=new Khova();
		total_weight += object.calculate_weight(Khova_weight,quantity);
		mygiftbox.put("Khova", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 3:
		System.out.println("Enter Kitkat units : ");
		quantity=scanner_object.nextInt();
		object=new Kitkat();
		total_weight += object.calculate_weight(Kitkat_weight,quantity);
		mygiftbox.put("Kitkat", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 4:
		System.out.println("Enter Snickers units : ");
		quantity=scanner_object.nextInt();
		object=new Snickers();
		total_weight += object.calculate_weight(Snickers_weight,quantity);
		mygiftbox.put("Snickers", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 5:
		System.out.println("Enter Khalakand units : ");
		quantity=scanner_object.nextInt();
		object=new Khalakand();
		total_weight += object.calculate_weight(Khalakand_weight,quantity);
		mygiftbox.put("Khalakand", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		break;
		}
		case 6:
		System.out.println("Enter Gulabjamun units : ");
		quantity=scanner_object.nextInt();
		object=new Gulabjamun();
		total_weight += object.calculate_weight(Gulabjamun_weight,quantity);
		mygiftbox.put("Gulabjamun", quantity);
		System.out.println("Do you want to add more items to the giftbox?(y/n)");
		addmore=scanner_object.next().charAt(0);
		if(addmore =='y' || addmore == 'Y') {
		flag=true;
		break;
		}else {
		flag=false;
		System.out.println("Gift box consist of ");
		object.print(mygiftbox);
		System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
		}
		default : System.out.println("Enter correct choice ");
		}
		}
		}
}


