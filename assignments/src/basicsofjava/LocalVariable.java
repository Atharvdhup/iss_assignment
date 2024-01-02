package basicsofjava;

public class LocalVariable {

	 public void dogYears() {
	      int dogAge = 0;
	      dogAge = dogAge + 13;
	      System.out.println("Dog age in years is: " + dogAge);
	   }

	   public static void main(String args[]) {
	      LocalVariable obj = new LocalVariable();
	      obj.dogYears();
	   }

}
