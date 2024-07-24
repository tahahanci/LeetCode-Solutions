package hncdev.math;

public class TotalMoney {

    /*
    Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
    He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than
    the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
    Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
     */

    public int totalMoney(int n) {
        int totalBalance = 0;
        int dailyDeposit = 1;
        int weekStartDeposit = 1;

        for (int i = 1; i <= n; i++) {
            totalBalance += dailyDeposit;
            dailyDeposit++;
            if (i % 7 == 0) {
                weekStartDeposit++;
                dailyDeposit = weekStartDeposit;
            }
        }

        return totalBalance;
    }

    public static void main(String[] args) {
        TotalMoney totalMoney = new TotalMoney();
        int accountBalance = totalMoney.totalMoney(20);

        System.out.println("Account balance: " + accountBalance);
    }
}
