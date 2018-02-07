package nagarajan.assign2.Omicron_Catering;

/**
 * Represents HighCarb Diet Plan, this uses HighCarbMeal category to load high carb recipes
 */
public class HighCarbDietPlan extends AbstractDietPlan {

	public HighCarbDietPlan(String fileName, Integer dayOfWeek, boolean deliveryForDinner) {
		super(fileName, dayOfWeek);
		mealCategory = new HighCarbMeal();
		createLunchAndDinner(deliveryForDinner);
	}
}