import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;
        String choice = "no";
        Scanner in = new Scanner(System.in);

        do {
            do {
                System.out.println("inserisci il valore del dado previsto:");
                predictedValue = in.nextInt();
                in.nextLine();
                if (predictedValue < 1 || predictedValue > 6)
                    System.out.println("ERRORE! Non è il valore di un dado");
            }
            while (predictedValue < 1 || predictedValue > 6);

            do {
                System.out.println("inserisci il valore della scommessa:");
                bet = in.nextDouble();
                in.nextLine();
                if (bet < 0 || bet > playerAccount.getBalance() || bet > (casinoAccount.getBalance() / 5))
                    System.out.println("ERRORE! è impossibile accettare questa scommessa");
            }
            while (bet < 0 || bet > playerAccount.getBalance() || bet > (casinoAccount.getBalance() / 5));

            Random r = new Random();
            actualValue = r.nextInt(1,7);
            if (actualValue == predictedValue) {
                casinoAccount.withdraw(5 * bet);
                playerAccount.deposit(5 * bet);
            } else {
                playerAccount.withdraw(bet);
                casinoAccount.deposit(bet);
            }
            if (playerAccount.getBalance() > 0) {
                System.out.println("vuoi continuare a scommettere?");
                choice = in.nextLine();
            }
        }
        while(choice.equals("sì"));

        System.out.println("Il tuo saldo è " + playerAccount.getBalance());

    }
}