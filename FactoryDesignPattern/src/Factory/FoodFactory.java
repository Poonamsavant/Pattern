package Factory;

public class FoodFactory {

	public Food getFood(String order) {
		if (order==null)
		return null;

		else if(order.equalsIgnoreCase("Cake"))
			return new Cake();
		else if(order.equalsIgnoreCase("pizza"))
			return new Pizza();
		else
			return null;
	}

}
