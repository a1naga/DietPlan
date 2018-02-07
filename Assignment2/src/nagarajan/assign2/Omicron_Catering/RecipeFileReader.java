package nagarajan.assign2.Omicron_Catering;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * File reader class to read the recipe file
 */
public class RecipeFileReader {

	private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();

	/**
	 * Opens the file with the given filename, read the contents, line by line.
	 * Each line from the file, contains the Recipe name, description, calories
	 * and cost. The line is tokenized by comma, an instance of a Recipe created
	 * with the field values and the instance added to the recipeList.
	 * 
	 * @param fileName
	 *            input file name
	 * @return recipe list
	 */
	public ArrayList<Recipe> readFile(String fileName) {
		BufferedReader br = null;
		try {

			br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileName)));
			String line = br.readLine();

			while (line != null) {
				// recipeName:desc:cost:calorie
				String[] recipeData = line.split(":");
				if (recipeData.length == 4) {
					Recipe recipe = new Recipe(recipeData[0], recipeData[1], Double.parseDouble(recipeData[2]),
							Integer.parseInt(recipeData[3]));
					recipeList.add(recipe);
				}
				line = br.readLine();
			}

			return recipeList;
		} catch (Exception e) {
			System.err.format("Exception occurred trying to read '%s'.", fileName);
			e.printStackTrace();
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
