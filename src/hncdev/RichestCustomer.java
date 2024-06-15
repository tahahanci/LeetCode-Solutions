package hncdev;

public class RichestCustomer {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > maxWealth) {
                maxWealth  = wealth;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        RichestCustomer richestCustomer = new RichestCustomer();
        int[][] accounts = new int[3][2];
        accounts[0][0] = 1;
        accounts[0][1] = 5;
        accounts[1][0] = 7;
        accounts[1][1] = 3;
        accounts[2][0] = 3;
        accounts[2][1] = 5;
        int maxWealth = richestCustomer.maximumWealth(accounts);
        System.out.println(maxWealth);
    }
}
