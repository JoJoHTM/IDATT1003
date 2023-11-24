import java.util.Scanner;

public class Oppg4 {
    /**
     * Presents the menu for the user, and awaits input from the user. The menu
     * choice selected by the user is being returned.
     *
     * @return the menu choice by the user as a positive number starting from 1.
     * If 0 is returned, the user has entered a wrong value
     */
    private int showMenu()
    {
        int menuChoice = 0;
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property");
        System.out.println("2. List all properties");
        System.out.println("3. Search property");
        System.out.println("4. Calculate average area");
        System.out.println("5. Quit");
        System.out.println("\nPlease enter a number between 1 and 9.\n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }
    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user,
     * and executing the selected functionality.
     */
    public void start() {
        EiendomsRegister register = new EiendomsRegister();
        Eiendom eiendom1 = new Eiendom(1445, "Gloppen", 77, 631, 1017.6, "Jens Olsen");
        Eiendom eiendom2 = new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        Eiendom eiendom3 = new Eiendom(1445, "Gloppen", 75, 19, "Fudletun", 650.6, "Evilyn Jensen");
        Eiendom eiendom4 = new Eiendom(1445, "Gloppen", 74, 188, 1457.2, "Karl Ove Bråten");
        Eiendom eiendom5 = new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

        register.registrerEiendom(eiendom1);
        register.registrerEiendom(eiendom2);
        register.registrerEiendom(eiendom3);
        register.registrerEiendom(eiendom4);
        register.registrerEiendom(eiendom5);

        boolean finished = false;
// The while-loop will run as long as the user has not selected
// to quit the application
        while (!finished) {
            int menuChoice = this.showMenu();
            switch (menuChoice)
            {
                case 1:

                    break;
                case 2:
//TODO: Fill inn your code here....
                    break;
                case 3:
//TODO: Fill inn your code here....
                    break;
                case 4:
//TODO: Fill inn your code here....
                    break;
                case 5:
                    System.out.println("Thank you for using the Properties app!\n");
                    finished = true;
                    break;
                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            }
        }
    }
}
