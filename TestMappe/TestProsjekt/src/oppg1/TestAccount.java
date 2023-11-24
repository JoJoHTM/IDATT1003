package oppg1;

import static javax.swing.JOptionPane.*;

public class TestAccount {
    public static void main(String[] args){
        /* Oppretter et objekt av klassen Account. */
        Account olesAccount = new Account(123456676756L, "Ole Olsen", 2300.50);
        int counter = 1;
        while (counter !=0) { // avslutter dersom bruker skriver inn 0
            String readTransaktion = showInputDialog("Velg transaksjon (avslutt, innskudd, uttak, saldo: ");
            char transaktion = readTransaktion.charAt(0);
            switch (transaktion) {
                case 'a':
                    counter = 0;
                    break;
                case 'i':
                    String readDeposit = showInputDialog("Hvor mye skal du sette inn på konto: ");
                    int deposit = Integer.parseInt(readDeposit);
                    olesAccount.add(deposit);
                    if (olesAccount.getSaldo() < 0)
                        showMessageDialog(null, "Etter innskudd har kontoen allikevel negativ saldo " + olesAccount.getSaldo());
                    else showMessageDialog(null, "Etter innskudd er saldoen lik " + olesAccount.getSaldo());
                    break;
                case 'u':
                    String readWithdraw = showInputDialog("Hvor mye skal du ta ut fra konto: ");
                    int withdraw = -Integer.parseInt(readWithdraw);
                    olesAccount.withdraw(withdraw);
                    if (olesAccount.getSaldo() < 0)
                        showMessageDialog(null, "Etter uttak har kontoen negativ saldo " + olesAccount.getSaldo());
                    else showMessageDialog(null, "Etter uttak er saldoen lik " + olesAccount.getSaldo());
                    break;
                case 's':
                    showMessageDialog(null, "Din saldo er " + olesAccount.getSaldo());
                    break;
            } // end switch
        }   // end while
    }
}
