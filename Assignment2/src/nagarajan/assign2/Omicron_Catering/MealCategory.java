package nagarajan.assign2.Omicron_Catering;

import java.util.ArrayList;

public interface MealCategory {

	public ArrayList <Recipe> showRecipes();

	public Recipe getARecipe();

	public void loadRecipes(String fileName);

}
