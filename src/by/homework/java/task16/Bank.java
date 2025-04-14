package by.homework.java.task16;


import java.util.HashSet;
import java.util.Set;

public class Bank {
    private final Set<Account> accounts;

    public Bank() {
        accounts = new HashSet<>();
    }


    public void addAccount(Account account) {
        accounts.add(account);
    }


    public void removeAccount(Account account) {
        accounts.remove(account);
    }


    public Set<Account> getAccounts() {
        return accounts;
    }


    public Account findByAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void printAllAccounts() {
        System.out.println("Все счета банка:");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }


    @Override
    public String toString() {
        return "Банк с " + accounts.size() + " счетами.";
    }


    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) throws AccountNotFoundException, NotEnoughMoneyException {

        Account fromAccount = findByAccountNumber(accountNumberFrom);
        if (fromAccount == null) {
            throw new AccountNotFoundException("not.found.account");
        }


        Account toAccount = findByAccountNumber(accountNumberTo);
        if (toAccount == null) {
            throw new AccountNotFoundException("not.found.account");
        }


        if (fromAccount.getBalance() < amount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }


        fromAccount.setBalance(fromAccount.getBalance() - amount);

        toAccount.setBalance(toAccount.getBalance() + amount);
    }


}
