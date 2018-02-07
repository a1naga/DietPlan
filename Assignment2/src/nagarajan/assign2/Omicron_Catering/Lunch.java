package nagarajan.assign2.Omicron_Catering;

public class Lunch extends AbstractMeal {

	public Lunch(MealCategory mealCategory) {
		recipe = mealCategory.getARecipe();
	}

	@Override
	public String getDetails() {
		
		return "Recipe name : " + recipe.getName() + "\n" + "Description : " + recipe.getDescription() + "\n"
				+ "Calories : " + recipe.getCalories() + "\n" + "Cost of recipe : $" + recipe.getCost() + "\n";
	}

}
