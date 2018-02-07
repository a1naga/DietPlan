package nagarajan.assign2.Omicron_Catering;

/**
 * Represents HitchHiker Diet Plan, this uses HitchHikerMeal category to load hitch hiker recipes
 */
public class HitchHikerDietPlan extends AbstractDietPlan {

	public HitchHikerDietPlan(String fileName, Integer dayOfWeek, boolean deliveryForDinner) {
		super(fileName, dayOfWeek);
		mealCategory = new HitchHikerMeal();
		createLunchAndDinner(deliveryForDinner);
	}
}