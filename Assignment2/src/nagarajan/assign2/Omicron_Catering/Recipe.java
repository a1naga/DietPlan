package nagarajan.assign2.Omicron_Catering;

public class Recipe {

	private String name;
	private String description;
	private double cost;
	private Integer calories;
	
	public Recipe(){
		
	}
	public Recipe(String name,String description,double cost,Integer calories){
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.calories = calories;
	}
	
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}
	
	public Integer getCalories() {
		return calories;
	}

	@Override
	public String toString() {
		return "Recipe name=" + name + ", description=" + description + ", cost=" + cost + ", calories=" + calories
				+ "\n";
	}
}
