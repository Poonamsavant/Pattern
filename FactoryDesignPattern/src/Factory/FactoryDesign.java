package Factory;

import java.util.Scanner;

public class FactoryDesign {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String order = sc.next();
		FoodFactory ff= new FoodFactory();
		Food f= ff.getFood(order);
		System.out.println("the factory returned class"+ order);
		System.out.println(f.getType());
	}
	
}
