package nagarajan.assign2.Omicron_Catering;

/**
 * Represents Vegan Diet Plan, this uses VeganMeal category to load vegan recipes
 */
public class VeganDietPlan extends AbstractDietPlan {

	public VeganDietPlan(String fileName, Integer dayOfWeek, boolean deliveryForDinner) {
		super(fileName, dayOfWeek);
		mealCategory = new VeganMeal();
		createLunchAndDinner(deliveryForDinner);
	}

}
