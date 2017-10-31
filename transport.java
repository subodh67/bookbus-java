import java.util.*;
import java.util.Scanner.*;

class details{                                                             

	private String name;
	private String email;
	private long number; 

	public details(String name,long number,String email)
	{
		this.name=name;
		this.email=email;
		this.number=number; 
	}

	@Override                                //for printing name 
	public String toString(){
		return name;
	}
}

public class transport
{
	static	details[][] a=new details[8][21];
	static	details[][] b=new details[8][21];
	static	details[][] c=new details[8][21];
	static Scanner sc =new Scanner(System.in);
	static String p;
	static int choice;

	public static void main(String args[])
	{
		while(choice!=4)
		{
			System.out.println("Welcome to transport service: ");
			System.out.println("1.Book a ticket");
			System.out.println("2.View price details");
			System.out.println("3.Check your booking");
			System.out.println("4.Exit");
			choice = sc.nextInt();

			switch(choice)
			{
			case 1:View();break;
			case 2:Price();break;
			case 3:Check();break;
			}
		}
	}

	public static void View()
	{
		Scanner st=new Scanner(System.in);
		Scanner sp=new Scanner(System.in);
		int flag=0;

		System.out.println("Select your day");
		System.out.println("1.monday");
		System.out.println("2.tuesday");
		System.out.println("3.wednesday");
		System.out.println("4.thursday");
		System.out.println("5.friday");
		System.out.println("6.saturday");
		System.out.println("7.sunday");
		int day = sc.nextInt();

		System.out.println("Select your destination");
		System.out.println("1.Surat");
		System.out.println("2.Banglore");
		System.out.println("3.Hyderabad");
		int route =sc.nextInt();

		if(route==1)
		{
			for(int seat=1;seat<21;seat++)
			{
				if(a[day][seat]==null)
				{
					System.out.println("Seat available");
					System.out.println("Price is 1000");
					System.out.println("Enter name\n");
					String name =st.nextLine();
					System.out.println("Enter number");    
					long num =sc.nextLong();
					System.out.println("Enter email");
					String id =sp.nextLine();
					flag=1;
							a[day][seat]=new details(name,num,id);
					System.out.println("Booking done Succesfully");
							System.out.println("Seat number:"+seat);   
					
							break;
				}
			}
		}

		if(route==2)
		{
			for(int seat=1;seat<21;seat++)
			{
				if(b[day][seat]==null)
				{
					System.out.println("Seat available");
					System.out.println("Price is 2000");
					System.out.println("Enter name");
					String name =st.nextLine();
					System.out.println("Enter number");    
					long num =sc.nextLong();
					System.out.println("Enter email");
					String id =sp.nextLine();
					flag=1;
					b[day][seat]=new details(name,num,id);
							System.out.println("Booking done Succesfully");
							System.out.println("Seat number:"+seat);
					break;
				}
			}
		}

		if(route==3)
		{
			for(int seat=1;seat<21;seat++)
			{
				if(c[day][seat]==null)
				{
					System.out.println("Seat available");
					System.out.println("Price is 2500");
					System.out.println("Enter name");
					String name =st.nextLine();
					System.out.println("Enter number");    
					long num =sc.nextLong();
					System.out.println("Enter email");
					String id =sp.nextLine();
					flag=1;
					c[day][seat]=new details(name,num,id);
					System.out.println("Booking done Succesfully");
					System.out.println("Seat number:"+seat);
					break;
				}
			}
		}

		if(flag==0)
			System.out.println("Seats full");
	}

	public static void Price()
	{
		System.out.println("Price of tickets:");
		System.out.println("Mumbai-Surat Rs1000");
		System.out.println("Mumbai-Banglore Rs2000");
		System.out.println("Mumbai-Hyderabad Rs2500");
	}

	public static void Check()
	{
		System.out.println("Select your day");
		System.out.println("1.monday");
		System.out.println("2.tuesday");
		System.out.println("3.wednesday");
		System.out.println("4.thursday");
		System.out.println("5.friday");
		System.out.println("6.saturday");
		System.out.println("7.sunday");
		int Day = sc.nextInt();

		System.out.println("Select your destination");
		System.out.println("1.Surat");
		System.out.println("2.Banglore");
		System.out.println("3.Hyderabad");
		int Route =sc.nextInt();

		System.out.println("Enter seat number");
		int seatno=sc.nextInt();
		System.out.println("This ticket belongs to:");

		if(Route==1)
			System.out.println(a[Day][seatno]);   //prints name

		if(Route==2)
			System.out.println(b[Day][seatno]);

		if(Route==3)
			System.out.println(c[Day][seatno]);
	}
}
