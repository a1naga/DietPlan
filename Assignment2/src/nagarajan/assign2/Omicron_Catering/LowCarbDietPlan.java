package nagarajan.assign2.Omicron_Catering;

/**
 * Represents Low Carb Diet Plan, this uses LowCarbMeal category to load low carb recipes
 */
public class LowCarbDietPlan extends  AbstractDietPlan {

	public LowCarbDietPlan(String fileName, Integer dayOfWeek, boolean deliveryForDinner) {
		super(fileName,dayOfWeek);
		mealCategory = new LowCarbMeal();
		createLunchAndDinner(deliveryForDinner);
	}

}
