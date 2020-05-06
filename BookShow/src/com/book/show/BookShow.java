package com.book.show;

import java.util.Scanner;

import com.book.show.City.BookShow1;
public class BookShow
{
	public static void main(String args[])
	{
		City c=new City();
		c.city();
		BookShow1 bs=new BookShow1();
		bs.bookSeat();
	}
}
class City 
{
String city[]= {"Bangalore","Delhi","Hyderabad","Lucknow"};
String Btheater[]= {"PVR Kormnagla","Gopalan innox","PVR Ballendur"};
String Dtheater[]= {"PVR Saket","sangam innox","PVR Haujkhas"};
String Htheater[]= {"PVR salectciity","Gopalan PVR","Inox 2469"};
String Ltheater[]= {"PVR Kor","Gopn innox","PVR Gomtinagar"};
String Date[]= {"23-1-2020","24-1-2020","25-1-2020"};
Theater t=new Theater();
	void city() {
		System.out.println("Welcome to BookShow!!:-)");
		for(int i=0;i<city.length;i++)
		{
			System.out.print(i+1);
		System.out.print('.'+city[i]+' ');	
		}
		System.out.println();
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Select the City.");
	int city1=sc.nextInt();
	if(city1==1)
	{
	t.theater1();
	}
	else if(city1==2)
	{
	 t.theater2();
	}
	else if(city1==3)
	{
		t.theater3();
	}
	else if(city1==4)
	{
		t.theater4();
	}
	else
	{
		System.out.println("Please Select From Given Option.");
		city();
	}
	
	}
	class Theater 
	{
		
	void theater1() {
		for(int i=0;i<Btheater.length;i++)
		{
				System.out.print(i+1);
				System.out.print('.'+Btheater[i]+' ');}
		System.out.println();
				System.out.println("Select the Theater.");
				Scanner sc=new Scanner(System.in);
			int	B=sc.nextInt();
			if(B==1||B==2||B==3) {
				System.out.println("Cool :-)");
				
				for(int i=0;i<Date.length;i++)
				{
					System.out.print(i+1);
					System.out.println('.'+Date[i]+' ');
				}
				System.out.println();
				System.out.println("Please Select The Date.");
				int date=sc.nextInt();
			}
			else {
				System.out.println("Please Select From the List.");
				theater1();
			}
		}
	
		void theater2() {
		for(int i=0;i<Btheater.length;i++)
		{
				System.out.print(i+1);
				System.out.print('.'+Dtheater[i]+' ');
		}
		System.out.println();
				System.out.println("Select the Theater.");
				Scanner sc=new Scanner(System.in);
				int	D=sc.nextInt();
				if(D==1||D==2||D==3) {
					System.out.println("Cool :-)");
					for(int i=0;i<Date.length;i++)
					{
						System.out.print(i+1);
						System.out.println('.'+Date[i]+' ');
					}
					System.out.println();
					System.out.println("Please Select The Date.");
					int date=sc.nextInt();
				//	for(int i=0;i<time.length;i++)
					//{
						//System
					//}
				}
				else {
					System.out.println("Please Select From the List.");
					theater2();
				}
		}
		
		void theater3() {
		for(int i=0;i<Htheater.length;i++)
		{
				System.out.print(i+1);
				System.out.print('.'+Htheater[i]+' ');
		}
		System.out.println();
				System.out.println("Select the Theater.");
				Scanner sc=new Scanner(System.in);
				int	H=sc.nextInt();
				if(H==1||H==2||H==3) {
					System.out.println("Cool :-)");
					for(int i=0;i<Date.length;i++)
					{
						System.out.print(i+1);
						System.out.print('.'+Date[i]+' ');
					}
					System.out.println();
					System.out.println("Please Select The Date");
					int date=sc.nextInt();
				}
				else {
					System.out.println("Please Select From the List.");
					theater3();
				}
		}
		
		void theater4() {
		for(int i=0;i<Ltheater.length;i++)
		{
				System.out.print(i+1);
				System.out.print('.'+Ltheater[i]+' ');
		}
		System.out.println();
				System.out.println("Select The Theater.");
				Scanner sc=new Scanner(System.in);
			int	L=sc.nextInt();
			if(L==1||L==2||L==3) {
				System.out.println("cool");
				for(int i=0;i<Date.length;i++)
				{
					System.out.print(i+1);
					System.out.println('.'+Date[i]+' ');
				}
				System.out.println();
				System.out.println("Please Select The Date");
				int date=sc.nextInt();
			}
			else {
				System.out.println("Please Select From the List.");
				theater4();
			}
				
		}
		
	}
		
static class BookShow1 {
	String movie[]= {"Chapaak","Avengers","Good News","Tanha ji"};
	static int seat[]= {100,90,120,150};
	int cost[]= {300,250,200,280};
	int price;
	int selectMovie()
	{
		for(int i=0;i<movie.length;i++)
		{
			System.out.print(i+1);
			
			System.out.println('.'+movie[i]);
		}
	
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose The Movie Which You Want To See.");
			int mv=sc.nextInt();
			if(mv==1||mv==2||mv==3||mv==4)
			{
				System.out.println("Cool :-)");
			}
			else
			{
				System.out.println("Please Select Frrom Given Option.");
				selectMovie();
			}
			
			System.out.println("How Many Seats You Want To Book.");
			int st=sc.nextInt();
			System.out.println(st);
			
			if(checkAvailabilty(st,mv)== true) {
				price=cost[mv-1];
				return st;
			}
			else {
				System.out.println("Housefull!! Please Try Another Movie.");
				return 0;
			}
			
	}	
					
		
	boolean checkAvailabilty(int set,int movi)
	{
		if(set<=seat[movi-1]) {
			seat[movi-1]=seat[movi-1]-set;
			return true;
		}
		else 
			return false;
		
	}
	
	void bookSeat(){
		int numberOfSeats=selectMovie();
		if(numberOfSeats!=0) {
			totalPrice(numberOfSeats);
		}
		else {
			System.out.println("Sorry :-(");
		}
	}
	
	void totalPrice(int seats) {
		System.out.println("Total Amamount is"+' ' +price*seats);
		System.out.println("Enter Your Card Details.");
		Scanner sc=new Scanner(System.in);
		long p=sc.nextLong();
		String l=Long.toString(p);
		if(l.length()==16) {
			System.out.println("Enter The 4 Digit OTP.");
			int o=sc.nextInt();
			String s=Integer.toString(o);
			if(s.length()==4)
			{
				System.out.println("Congratulation!! Payment Successfull.");
				System.out.println("YEAH :-) Booking Done.");
				System.out.println("Do You Want To Book More Seat.");
				String rebook=sc.next();
				if(rebook.equalsIgnoreCase("yes"))
				{
					System.out.println("Great :-)");
					bookSeat();
					
					
				}
				else {
					System.out.println("Thankyou For Booking!! Enjoy Your Movie.");
				}
			}
			else
			{
				System.out.println("Invalid OTP :-(");
				System.exit(0);
			}}
		else  {
			System.out.println("Invlid Card Number :-(");
			System.exit(0);
			}
		}
		
	

}
		

}