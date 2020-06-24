package ru.stqa.pft.run;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Myfirstprogram {

	public static void main(String[] args){
		hello("Alena");
		hello("Alena");
		hello("Alena");
		double len=5;
		System.out.println("Площадь квадрата со стороной " + len +" = "+ area (len));
		double a=4;
		double b=5;
		System.out.println("Площадь прямоугольника со сторонами" + a + " и " + b + "=" + area (a, b));
}
public static void hello(String soody) {
	System.out.println("Hello," +soody+ "!");
}
public static double area (double v )
{
	return  v*v;
}
public static double area (double a,double b){
		return  a*b;
}
}