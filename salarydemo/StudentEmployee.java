package salarydemo;

/**
 * A student employee receives payment in the form of knowledge. Thus, their pay will be zero.
 */
public class StudentEmployee extends Employee {

	/**
	 * Creates a StudentEmployee object with the provided name string.
	 * @param name The name of the student employee.
	 */
	public StudentEmployee StudentEmployee(String name) {
		setName(name);
	}

	/**
	 * Takes in the amount of hours worked, returns 0 regardless.
	 * @param hoursWorked
	 */
	public double weeklyPay(int hoursWorked) {
		return 0.0;
	}

}
