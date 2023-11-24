import static javax.swing.JOptionPane.*;

/**
 * NTNU - IDATA1001, IDATG1001,IDATT1001 Programmering 1
 * Proposed solution exercise 4 task 1 (CurrencyClient)
 * Program is a client that creates three Currency objects that represent different currencies.
 * The program offers the opportunity to calculate the different currencies to/from NOK.
 *
 * @author Steffen Trømborg
 * @version 1.0
 */
class CurrencyClient {
	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(String[]args) {
		Currency usd = new Currency("USD", 0.11);
		Currency sek = new Currency("SEK", 0.98);
		Currency eur = new Currency("EUR", 0.093);

		String menu = "\n----------\n1. USD\n2. SEK\n3. EUR\n4. Exit\n----------";
		String input = showInputDialog("Choose currency (4 exits): " + menu);
		int choice = Integer.parseInt(input);

		while (choice != 4) {
			if (choice > 0 && choice < 4) {
				String amountRead = showInputDialog("Enter the amount to be converted:");
				double amount = Double.parseDouble(amountRead);

				int answer = showConfirmDialog(null, "Need to convert from NOK?", "Currency", YES_NO_OPTION);

				boolean toNok = (answer == YES_OPTION);
				boolean okMenuChoise = true;
				double answerAmount = 0;
				String currencyName = "";

				switch(choice) {
					case 1: 
						if (toNok) {
							answerAmount = usd.calcToNok(amount);
						} else {
							answerAmount = usd.calcFromNok(amount);
						}
						currencyName = "USD";
						break;
					case 2: 
						if (toNok) {
							answerAmount = sek.calcToNok(amount);
						} else {
							answerAmount = sek.calcFromNok(amount);
						}
						currencyName = "SEK";
						break;
					case 3: 
						if (toNok) {
							answerAmount = eur.calcToNok(amount);
						} else {
							answerAmount = eur.calcFromNok(amount);
						}
						currencyName = "EUR";
						break;
					default:
						break;
				}

				if (toNok) {
					showMessageDialog(null, amount + " NOK = " + answerAmount + " " + currencyName);
				} else {
					showMessageDialog(null, amount + " " + currencyName + " = " + answerAmount + " NOK");
				}
			} else {
				showMessageDialog(null, "Invalid menu choice");
			}
			input = showInputDialog("Choose currency (4 exits): " + menu);
			choice = Integer.parseInt(input);
		}
	}
}