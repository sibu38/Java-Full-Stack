package com.enumeration;

enum Status{NEW(0),REJECTED(1),ACCEPTED(2),COMPLETED(3);
	int value;
	Status(int val){
		this.value=val;
	}
	public void setStatus(int value){
		this.value=value;
	}
	public int getValue(){
		return this.value;
	}
	public String toString(){
		String s="";
		switch(this){
			case NEW: s+="NEW "+value;break;
			case REJECTED: s+="REJECTED "+value;break;
			case ACCEPTED:s+="ACCEPTED "+value;break;
			case COMPLETED:s+="COMPLETED "+value;break;
		}
		return s;
	}
}	
class Order{
	Status s;
	private int orderId,quantity,price;
	private String name;
	public Order(String name,int orderId,  int quantity, int price, Status type){
		this.orderId=orderId;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		s=type;
	}
	public String toString(){
		return "Name= "+name+"\n OrderId= "+orderId+"\n Quantity= "+quantity+"\n Price= "+price+"\n"+s;
	}
}
class EnumTest{
	public static void main(String []args){
		Order obj[]=new Order[4];
		obj[0]=new Order("Sibu",111,10,5000,Status.NEW);
		obj[1]=new Order("Atul",112,12,8000,Status.REJECTED);
		obj[2]=new Order("Anish",113,9,7000,Status.ACCEPTED);
		obj[3]=new Order("Satwik",114,15,15000,Status.COMPLETED);
		for(int i=0;i<obj.length;i++){
		System.out.println(obj[i]);
		}
	}
}