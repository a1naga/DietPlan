package nagarajan.assign2.Omicron_Catering;

import java.util.ArrayList;
import java.util.Random;

/**
 * AbstractMealCategory that contains a list of recipes for this meal category
 */
public abstract class AbstractMealCategory implements MealCategory {

	protected ArrayList<Recipe> recipeList;

	@Override
	public ArrayList<Recipe> showRecipes() {
		return recipeList;
	}

	/**
	 * Randomly picks a recipe from recipeList and returning it.
	 * The variable tempRecipe is used for ensuring the same recipe is not
	 * selected for both lunch and dinner
	 */
	@Override
	public Recipe getARecipe() {
		Random rand = new Random();
		int i = rand.nextInt(recipeList.size());
		Recipe tempRecipe = recipeList.get(i);
		recipeList.remove(i);
		return tempRecipe;

	}

	/**
	 * Loads recipe list from the given fileName
	 */
	@Override
	public void loadRecipes(String fileName) {
		RecipeFileReader read = new RecipeFileReader();
		recipeList = read.readFile(fileName);
	}

}
