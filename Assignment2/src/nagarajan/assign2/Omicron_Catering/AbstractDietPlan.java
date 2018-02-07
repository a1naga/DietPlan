package nagarajan.assign2.Omicron_Catering;

/**
 * At present this AbstractDietPlan is extended by 4 subclasses namely VeganDietPlan,
 * HighCarbDietPlan,LowCarbDietPlan and HitchHikerDietPlan
 */
public class AbstractDietPlan implements DietPlan {

	protected Meal lunch;
	protected Meal dinner;
	protected String fileName;
	protected String dayOfWeek;
	protected MealCategory mealCategory;
	private static String[] DAYS = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	/**
	 * Based on the dayOfWeek passed in as an integer, the corresponding day of
	 * the week as a String is set.
	 */
	public AbstractDietPlan(String fileName, Integer dayOfWeek) {
		this.fileName = fileName;
		this.dayOfWeek = DAYS[dayOfWeek-1];
	}

	protected void createLunchAndDinner(boolean deliveryForDinner) {
		mealCategory.loadRecipes(fileName);
		lunch = new Lunch(mealCategory);
		dinner = new Dinner(mealCategory, deliveryForDinner);
	}
	
	@Override
	public String showPlan() {
		return "Lunch Menu for " + dayOfWeek + ":\n" + lunch.getDetails() + "\nDinner Menu  for " + dayOfWeek + ":\n"
				+ dinner.getDetails();
	}

	/**
	 * returns the total cost of lunch and dinner
	 */
	@Override
	public double getCostOfPlan() {
		return lunch.getCost() + dinner.getCost();
	}

}
