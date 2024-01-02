

package basicsofjava;

public class InstanceVariable {

	// This instance variable is visible for any child class.
	   public String employeeName;

	   // Salary variable is visible in InstanceVariable class only.
	   private double employeeSalary;

	   // The employeeName variable is assigned in the constructor.
	   public InstanceVariable(String empName) {
	      employeeName = empName;
	   }

	   // The employeeSalary variable is assigned a value.
	   public void setEmployeeSalary(double empSal) {
	      employeeSalary = empSal;
	   }

	   // This method prints the employee details.
	   public void printEmployee() {
	      System.out.println("Name  : " + employeeName);
	      System.out.println("Salary :" + employeeSalary);
	   }

	   public static void main(String args[]) {
	      InstanceVariable empOne = new InstanceVariable("Atharv");
	      empOne.setEmployeeSalary(100000);
	      empOne.printEmployee();
	   }
}
