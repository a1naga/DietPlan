package nagarajan.assign2.Omicron_Catering;

import java.util.Calendar;
import java.util.Date;

/**
 * this class is used to create orders for various diet plans, make payment and generate invoice.
 * valid diet plans are VEGAN, HIGH_CARB, LOW_CARB, HITCH_HIKER 
 */
public class DietPlanOrder {

	private String customerName;
	private DietPlan plan;
	private boolean paymentStatus;
	private MealType mealType;
	private double amount;

	private Date today = new Date();
	private Calendar calendar = Calendar.getInstance();

	
	public DietPlanOrder(String customerName, String fileName, MealType mealType, boolean deliveryForDinner) {

		int day = calendar.get(Calendar.DAY_OF_WEEK);
		this.customerName = customerName;
		this.mealType = mealType;

		switch (this.mealType) {
		case VEGAN:
			plan = new VeganDietPlan(fileName, day, deliveryForDinner);
			break;
		case HIGH_CARB:
			plan = new HighCarbDietPlan(fileName, day, deliveryForDinner);
			break;
		case LOW_CARB:
			this.plan = new LowCarbDietPlan(fileName, day, deliveryForDinner);
			break;
		case HITCH_HIKER:
			this.plan = new HitchHikerDietPlan(fileName, day, deliveryForDinner);
			break;
		}
	}

	public double getCost() {
		return plan.getCostOfPlan();
	}

	/**
	 * A credit card number is verified as follows -
	 * 
	 * Master Card: A length of 16 digits. First digit is a 5 and second digit
	 * is in the range 1 through 5 inclusive. Visa: The length is either 13 or
	 * 16 digits with a first digit of 4.
	 * 
	 * If the card number is valid paymentStatus is set to true. Otherwise, to
	 * false.
	 */
	public boolean acceptPayment(String cardName, String cardNumber, double amount) {

		this.amount = amount;
		if (cardName.equals("Master")) {
			if (cardNumber.length() == 16 && cardNumber.matches("^5[1-5][0-9]*$")) {

				paymentStatus = true;
			} else {
				paymentStatus = false;
			}

		} 
		else if (cardName.equals("Visa")) {
			if ((cardNumber.length() == 16 || cardNumber.length() == 13) && cardNumber.matches("^4[0-9]*$")) {
				paymentStatus = true;
			} else {
				paymentStatus = false;
			}
		}

		return paymentStatus;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public DietPlan getPlan() {
		return plan;
	}

	public void setPlan(DietPlan plan) {
		this.plan = plan;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	/*
	 * If the Payment Status is true generate Invoice, else Print an Error message.
	 */
	public void generateInvoice() {
		if(this.isPaymentStatus()){
			System.out.println("Customer Name : " + customerName + "\n");
			System.out.println("Today’s Date : " + today.toString() + "\n");
			System.out.println("Details of " + this.mealType + " Diet Plan : " + plan.showPlan() + "\n");
			System.out.println("Amount Paid :" + this.amount + "\n");
		}else{
			System.out.println("Customer Name : " + customerName);
			System.out.println("Error: Payment not Accepted. Enter a Valid Card Number.\n");
		}
		
	}
}
