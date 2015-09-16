package salarydemo;

/**
 * A manager is a salaried employee who also receives a bonus.
 */
public class Manager extends SalariedEmployee {
	private double _weeklyBonus;

	/**
	 * Constructs a manager with a given name, annual salary and weekly bonus.
	 * @param aName the name of this employee
	 * @param aSalary the annual salary
	 * @param aBonus the weekly bonus
	 */
	public Manager(String aName, double aSalary, double aBonus) {
		throw new UnsupportedOperationException();
	}

	public double weeklyPay(int aHoursWorked) {
		throw new UnsupportedOperationException();
	}
}