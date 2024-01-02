package basicsofjava;

public class StaticVariable {

	// employeeSalary is a private static variable
	   private static double employeeSalary;

	   // TEAM is a constant
	   public static final String TEAM = "Finance ";

	   public static void main(String args[]) {
	      employeeSalary = 1200; 
	      System.out.println(TEAM + "average salary: " + employeeSalary);
	   }

}
