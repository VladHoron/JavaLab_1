package lab_1;

public class Crane {
	
	private int minimum_lift_height;
	private int price;
	public int maximum_lifting_weight;
	public String producer;
	public String color;
	public static int minimum_lifting_weight;
	protected int weight;
	protected int maximum_lift_height;
	
	//Gets and Sets
	
	public void setMinimum_lift_height(int addMinimum_lift_height) {
		this.minimum_lift_height = addMinimum_lift_height;
	}
	
	public int getMinimum_lift_height() {
		return minimum_lift_height;
	}
	
	public void setPrice(int addPrice) {
		this.price = addPrice;
	}
	
	public int getPrice() {
		return price;
	}
	
	public Crane() {
		
	}
	
	public Crane(String producer, int maximum_lifting_weight, String color) {
		this.producer = producer;
		this.maximum_lifting_weight = maximum_lifting_weight;
		this.color = color;
	}
	
	public Crane(String producer, int price, int maximum_lifting_weight, int minimum_lift_height, int maximum_lift_height, int weight, String color) {
		this.producer = producer;
		this.price = price;
		this.minimum_lifting_weight = minimum_lifting_weight;
		this.maximum_lifting_weight = maximum_lifting_weight;
		this.minimum_lift_height = minimum_lift_height;
		this.maximum_lift_height = maximum_lift_height;
		this.weight = weight;
		this.color = color;
}
	
	public String toString() {
		return String.format("Producer - %s \n Price - %d UAH \n minimum_lifting_weight - %d tones \n maximum_lifting_weight - %d tones \n minimum_lift_height - %d millimeters \n maximum_lift_height - %d millimeters \n weight - %d kilograms \n color - %s \n", producer, price, minimum_lifting_weight, maximum_lifting_weight, minimum_lift_height, maximum_lift_height, weight, color);
	}
	
    public static void printStaticMinimum_lifting_weight(){
        System.out.println("Minimum lifting weight - " +minimum_lifting_weight);
    }

    public void printMinimum_lifting_weight(){
        System.out.println("Minimum lifting weight - " +minimum_lifting_weight);
    }
	
	
	public void resetValues(String producer, int price, int maximum_lifting_weight, int minimum_lift_height, int maximum_lift_height, int weight, String color) {
		this.producer = producer;
		this.price = price;
		this.minimum_lifting_weight = minimum_lifting_weight;
		this.maximum_lifting_weight = maximum_lifting_weight;
		this.minimum_lift_height = minimum_lift_height;
		this.maximum_lift_height = maximum_lift_height;
		this.weight = weight;
		this.color = color;
	}
	
}
	
	

