package nagarajan.assign2.Omicron_Catering;

public class Dinner extends AbstractMeal {

	private double deliveryFee;
	private boolean delivery;
	
	public Dinner(MealCategory mealCategory, boolean delivery) {
		this.delivery = delivery;
		recipe = mealCategory.getARecipe();
		if (delivery) {
			setDeliveryFee(20.0);
		} else {
			setDeliveryFee(0.0);
		}
	}

	public void setDeliveryFee(double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public double getDeliveryFee() {
		return this.deliveryFee;
	}
	
	@Override
	public double getCost() {
		return recipe.getCost() + this.deliveryFee;
	}

	@Override
	public String getDetails() {
		return "Recipe name : " + recipe.getName() + "\n" + "Description : " + recipe.getDescription() + "\n"
				+ "Calories : " + recipe.getCalories() + "\n" + "Cost of recipe : $" + recipe.getCost() + "\n"
				+ "Delivery " + delivery + "\n" + "Delivery fee : $" + getDeliveryFee();
	}

}
