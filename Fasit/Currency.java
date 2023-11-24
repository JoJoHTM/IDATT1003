/**
 * NTNU - IDATA1001, IDATG1001,IDATT1001 Programmering 1
 * Proposed solution exercise 4 task 1 (Currency)
 * A currency exchange class that calculates to/from NOK.
 *
 * @author Steffen Trømborg
 * @version 1.0
 */
public class Currency {
	private String name;
	private double rate;

	/**
	 * Instantiates a new Currency.
	 *
	 * @param name the name
	 * @param rate the rate
	 */
	public Currency(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	/**
	 * Calc to nok double.
	 *
	 * @param amount the amount
	 * @return the double
	 */
	public double calcToNok(double amount) {
		return amount * rate;
	}

	/**
	 * Calc from nok double.
	 *
	 * @param amount the amount
	 * @return the double
	 */
	public double calcFromNok(double amount) {
		return amount / rate;
	}

	/**
	 * Sets rate.
	 *
	 * @param newRate the new rate
	 */
	public void setRate(double newRate) {
		this.rate = newRate;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}