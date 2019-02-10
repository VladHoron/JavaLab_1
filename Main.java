package lab_1;

public class Main {
	public static void main(String[] args) {
		Crane crane_1 = new Crane();
		Crane crane_2 = new Crane("Miol 80-245 \n", 3, "red");

		 
		Crane crane_3 =  new Crane("YATO YT-1720 \n", 2671, 2, 89, 359, 16, "black");

		
		System.out.println(crane_1.toString());
		System.out.println(crane_2.toString());
		System.out.println(crane_3.toString());
		
		System.out.println("\n printStaticMinimum_lifting_weight \n");
		crane_1.printStaticMinimum_lifting_weight();
		crane_2.printStaticMinimum_lifting_weight();
		crane_3.printStaticMinimum_lifting_weight();
		
		System.out.println("\n printMinimum_lifting_weight \n");
		
		crane_1.printMinimum_lifting_weight();
		crane_2.printMinimum_lifting_weight();
		crane_3.printMinimum_lifting_weight();

	}

}
