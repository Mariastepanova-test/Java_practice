package by.homework.java.task16;

public class Main {
    public static void main(String[] args) throws AccountNotFoundException, NotEnoughMoneyException {
        try {
            Bank bank = new Bank();

            Account account1 = new Account(1, "123450", "BYN", 1000.0);
            Account account2 = new Account(2, "678900", "BYN", 500.0);
            Account account3 = new Account(3,"523011","USD",600.0);
            Account account4 = new Account(4,"478444","EUR",300.0);
            Account account5 = new Account(5,"896123","BYN",560.0);


            bank.addAccount(account1);
            bank.addAccount(account2);
            bank.addAccount(account3);
            bank.addAccount(account4);
            bank.addAccount(account5);

            for (Account account : bank.getAccounts()) {
                System.out.println("Номер счёта: " + account.getAccountNumber() + ", валюта: " + account.getCurrency() + ", актуальный баланс: " + account.getBalance());
            }

            bank.transferMoney("123450", "678900", 200.0);


            bank.transferMoney("123450", "67890", 1600.0);


            bank.transferMoney("896124", "67890", 300.0);


        } catch (AccountNotFoundException e) {
        System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (NotEnoughMoneyException e) {
        System.out.println("Недостаточно средств для перевода.");
        } finally {
                System.out.println("Спасибо, что воспользовались услугами банка.");
        }
    }
}

