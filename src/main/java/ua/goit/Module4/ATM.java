package ua.goit.Module4;

public class ATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(1001));
    }

    public int countBanknotes(int sum) {
        int[]denomination = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int index = 0;
        int countBanknotes = 0;

        while (index <= denomination.length) {
            if (sum >= denomination[index])
            {
                countBanknotes++;
                sum -= denomination[index];
            } else if (sum < denomination[index] && sum != 0) {
                index++;
            } else  {
                return countBanknotes;
            }
        }
        return countBanknotes;
    }
}
