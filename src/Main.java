import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account("123456789", 1000.0);

        myAccount.deposit(500.0);
        myAccount.deposit(200.0);
        myAccount.deposit(100.0);

        myAccount.clearHist();
        System.out.println("Суммы пополнений после очистки: " + Arrays.toString(myAccount.getDepositAmounts()));
    }
}

