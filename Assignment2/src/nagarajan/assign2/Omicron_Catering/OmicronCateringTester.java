package nagarajan.assign2.Omicron_Catering;

import java.io.IOException;

public class OmicronCateringTester {

	public static void main(String[] args) throws IOException {
		
		// Test case for Vegan Diet Plan Order
		DietPlanOrder planOrder1 = new DietPlanOrder("Mary Jones",
				"/recipes/VEGAN_Recipes.txt", MealType.VEGAN,true);

		planOrder1.acceptPayment("Master", "5278764698672156", planOrder1.getCost());
		planOrder1.generateInvoice();
		
		System.out.println("------------------------------------------------\n");
		
		// Test case for Invalid card Number 
		DietPlanOrder planOrder2 = new DietPlanOrder("Isebella James",
				"/recipes/VEGAN_Recipes.txt", MealType.VEGAN,true);

		planOrder2.acceptPayment("Master", "2278764698672156", planOrder2.getCost());
		planOrder2.generateInvoice();
		
		System.out.println("------------------------------------------------\n");
		
		// Test case for LOW_CARB Diet Plan Order
		DietPlanOrder planOrder3 = new DietPlanOrder("Alexander Davis",
				"/recipes/LOW_CARB_Recipes.txt", MealType.LOW_CARB,false);

		planOrder3.acceptPayment("Visa", "4978269638672136", planOrder3.getCost());
		planOrder3.generateInvoice();
		
		System.out.println("------------------------------------------------\n");
		
		// Test case for HIGH_CARB Diet Plan Order
		DietPlanOrder planOrder4 = new DietPlanOrder("Alvin Scott",
				"/recipes/HIGH_CARB_Recipes.txt", MealType.HIGH_CARB,true);
		planOrder4.acceptPayment("Master", "5278764698672156", planOrder4.getCost());
		planOrder4.generateInvoice();
		
		System.out.println("------------------------------------------------\n");
		
		// Test case for HITCH_HIKER Diet Plan Order
		DietPlanOrder planOrder5 = new DietPlanOrder("Olivia Cooper",
				"/recipes/HITCH_HIKER_Recipes.txt", MealType.HITCH_HIKER,false);
		planOrder5.acceptPayment("Master", "5278764698672156", planOrder5.getCost());
		planOrder5.generateInvoice();

	}
}
