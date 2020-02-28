package com.generics;

class WrapperClass<T>
{
	private T t;
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	@Override
	public String toString() {
		return "WrapperClass [T t=" + t + "]";
	}
}
public class GenericWrapper {
	public static void main(String []args) {
		WrapperClass <Integer> w1=new WrapperClass<Integer>();
		w1.setT(1);
		System.out.println(w1.getT());
		WrapperClass <String> w2=new WrapperClass<String>();
		w2.setT("HEllO");
		System.out.println(w2.getT());
		WrapperClass <Float> w3=new WrapperClass<Float>();
		w3.setT(12.34f);
		System.out.println(w3.getT());
		WrapperClass <Double> w4=new WrapperClass<Double>();
		w4.setT(12.345678);
		System.out.println(w4.getT());
	}
}
