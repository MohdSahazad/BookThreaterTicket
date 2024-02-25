import java.util.Random;
import java.util.Scanner;

//Create class
public class BookTheaterTicket {
	void Login() {
		
		while(true)
		{
		try {
			
		Random r=new Random();
		int id=r.nextInt(10000);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number "+id+" Then You Are Login !!");
		int Login_id=sc.nextInt();
		if(Login_id==id) 
		{
			System.out.println("Login Successfully ...");
			System.out.println();
			System.out.println();
			return;
		}
		else
		{
			System.out.println("Please Enter Currect Login Id !!");
			System.out.println();
			System.out.println();
		}
		}
		
		catch (Exception InputMismatchException) {
			System.out.println("Please input Number !! Not Character...");
			System.out.println();
			System.out.println();
		}
		}
	}
	
	
	void Details()
	{
		
		Scanner r=new Scanner(System.in);
		System.out.println("Please Enter Your Name : ");
	    name=r.nextLine();
	    while(true)
	    {
		System.out.println("Please Enter Your Age : ");
		 age=r.nextInt();
		if(age>15)
		{
			 System.out.println();
			 System.out.println();
			System.out.println("You Can Book Ticket... ");
			return;
			
		}
		else  
		{
			System.out.println();
			System.out.println("***************************************************");
			System.out.println();
			System.out.println("You Can Not Book Ticket !! Age Below...");
			System.out.println("Please put your Age !! Above 15 Years...");
			System.out.println();
			System.out.println("***************************************************");
			System.out.println();
			System.out.println();
			 System.out.println("Thankyou For Using This App : "+name);
			    System.out.println("Devloped By :");
			    System.out.println("            Mohd Sahazad.");
			    System.out.println();
			    System.out.println();
			    System.out.println();
		}
	}
	}
	
	int age;
	String name;
	 int total_seats=10;
	 
	 //print random number
	 Random ran=new Random();
	 int price=ran.nextInt(1000);
	 java.util.Date date=new java.util.Date();
	
	 
	 //Create Synchronized Method
	synchronized void bookSeat()
		{
		while(true)
		{
		
		System.out.println();
		System.out.println("Available Sheets !!  "+total_seats);
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Tell Me : How Much Book Ticket...");
		int seats=sc.nextInt();
		int total_amount=seats*price;
		System.out.println("Ticket Book Total Amount : "+total_amount);
		System.out.println();
		System.out.println("Please Pay Total Amount : ");
		long pay_money=sc.nextLong();
				
		  if(total_seats>=seats && total_amount==pay_money)
		  {
			System.out.println();
		    System.out.println("***********************************************************");
		    System.out.println(" Congratulations !! Ticket Booked Successfully...");
		    System.out.println("___________________________________________________________");
		    System.out.println();
			System.out.println("Your Name : "+name);
			System.out.println("Your Age : "+age); 
		    System.out.println("Total Booked Ticket : "+seats);
		    System.out.println("Ticket Booking Date  :  "+date);
		    total_seats=total_seats-seats;
		    System.out.println("Available Sheets !!  " +total_seats);
		    System.out.println();
		    System.out.println("____________________________________________________________");
		    System.out.println("Thankyou For Using This App : "+name);
		    System.out.println("Devloped By :");
		    System.out.println("            Mohd Sahazad.");
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    
		    
		  }
		  else if(total_seats<=seats)
	{
	    System.out.println("***************************************************");
	    System.out.println();
		System.out.println(" Sorry Seats Not Available !! ");
		System.out.println("Only : "+total_seats+" Sheets");
		System.out.println("Please Book Imediatly...");
		System.out.println();
		System.out.println("***************************************************");
		
		 System.out.println("Thankyou For Using This App : "+name);
		    System.out.println("Devloped By :");
		    System.out.println("            Mohd Sahazad.");
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    System.out.println();
	}
		  else
		  {
			  System.out.println("Please Pay Currect Amount !! Thanlkyou...");
			  System.out.println();
			  System.out.println("Thankyou For Using This App : "+name);
			    System.out.println("Devloped By :");
			    System.out.println("            Mohd Sahazad.");
			    System.out.println();
			    System.out.println();
			    System.out.println();
			    System.out.println();
			    System.out.println();
		  }
		}
}
  }
// Create class with multi threading
class MovieBookApp extends Thread {
	static	BookTheaterTicket b;
	public void run ()
	{
		 b.Login();
		 b.Details();
	     b.bookSeat();
  
	}
	public static void main(String[] args) {
		
		//create Object 1 class
	b=new BookTheaterTicket();
	
	//create object 2 class
		MovieBookApp s=new MovieBookApp();
		s.start();
	}
}