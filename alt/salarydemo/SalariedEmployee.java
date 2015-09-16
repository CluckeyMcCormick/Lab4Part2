package salarydemo;

/**
 * A salaried employee is paid the same amount independent of the hours worked.
 */
public class SalariedEmployee extends Employee {
	private double _annualSalary;

	/**
	 * Constructs a salaried employee with a given name and annual salary.
	 * @param aName the name of this employee
	 * @param aSalary the annual salary
	 */
	public SalariedEmployee(String aName, double aSalary) {
		throw new UnsupportedOperationException();
	}

	public double weeklyPay(int aHoursWorked) {
		throw new UnsupportedOperationException();
	}
}