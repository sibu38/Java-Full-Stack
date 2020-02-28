package Lambda_Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface PrintOrder
{
	int print(double p,String s);
}
class Order
{
	int id;
	String name;
	double Price;
	String status;
	public Order(int id, String name, double price, String status) {
		this.id = id;
		this.name = name;
		Price = price;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", Price=" + Price + ", status=" + status + "]";
	}
	
}
public class OrderTestQ2 {
	static int flag=0;
	public static void main(String []args)
	{
		List<Order> order=new ArrayList<Order>();
		order.add(new Order(1,"Nokia",15000,"ORDERED"));
		order.add(new Order(2,"Samsung",25000,"ACCEPTED"));
		order.add(new Order(3,"Iphone",55000,"NEW"));
		order.add(new Order(4,"Vivo",7000,"COMPLETED"));
		order.add(new Order(5,"Oppo",9000,"ACCEPTED"));
		
		System.out.println("Enter the Criteria.\n1.Price > 10000 \t2.COMPLETED or ACCEPTED");
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		
		PrintOrder po=(double p,String s)->
			{switch(a) 
				{
				case 1:
					if (p>10000)
						flag=1;
					else flag=0;
						break;
				case 2:
					if (s.equals("COMPLETED")||s.equals("ACCEPTED"))
						flag=2;
					else flag=0;
						break;
				default: flag=0; 
						System.out.println("Invalid Option");
				}return flag;
			};
			for(int i=0;i<order.size();i++)
			{
				int x=po.print(order.get(i).getPrice(),order.get(i).getStatus());
				if(flag==0)
					break;
				if(flag==1)
					System.out.println(order.get(i));
				if(flag==2)
					System.out.println(order.get(i));
				
		}
	}
}