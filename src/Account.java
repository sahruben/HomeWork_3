import java.util.Arrays;

public class Account {
    private String accountNumber;
    private double balance;
    private double[] depositAmounts;

    // Конструктор класса
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.depositAmounts = new double[0];
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение на " + amount + " успешно. Новый баланс: " + balance);
            recordDeposit(amount);
        } else {
            System.out.println("Ошибка: сумма для пополнения должна быть положительной.");
        }
    }

    // Метод для записи суммы пополнения в массив
    private void recordDeposit(double amount) {
        depositAmounts = Arrays.copyOf(depositAmounts, depositAmounts.length + 1);
        depositAmounts[depositAmounts.length - 1] = amount;
    }

    // Метод для очистки истории пополнений
    public void clearHist() {
        depositAmounts = new double[0];
        System.out.println("История пополнений очищена.");
    }

    // Метод для получения массива сумм пополнений
    public double[] getDepositAmounts() {
        return depositAmounts;
    }

}
