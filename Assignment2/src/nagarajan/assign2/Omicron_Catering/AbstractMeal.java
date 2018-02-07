package nagarajan.assign2.Omicron_Catering;

/**
 * AbstractMeal that contains a recipe for the meal
 */
public abstract class AbstractMeal implements Meal {

	protected Recipe recipe;

	@Override
	public Recipe getARecipe() {
		return recipe;
	}

	@Override
	public Integer getCalories() {
		return recipe.getCalories();
	}

	@Override
	public double getCost() {
		return recipe.getCost();
	}

	@Override
	public String getDetails() {
		return null;
	}

}
