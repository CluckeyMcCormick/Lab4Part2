package salarydemo;

/**
 * A student employee receives payment in the form of knowledge. Thus, their pay will be zero.
 */
public class StudentEmployee extends Employee {

	/**
	 * Creates a StudentEmployee object with the provided name string.
	 * @param aName The name of the student employee.
	 */
	public StudentEmployee StudentEmployee(String aName) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Takes in the amount of hours worked, returns 0 regardless.
	 */
	public double weeklyPay(int aHoursWorked) {
		throw new UnsupportedOperationException();
	}
}