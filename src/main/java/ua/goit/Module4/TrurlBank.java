package ua.goit.Module4;

public class TrurlBank {
    public static void main(String[] args) {
        TrurlBank trurlBank = new TrurlBank();
        System.out.println(trurlBank.countBanknotes(1001));
    }

    public int sumQuads(int n) {
        int index = 0;
        int sumSquare = 1;
        while(index < n) {
            index++;
            sumSquare += index*index;
        }
        return sumSquare - 1;
    }

    public int countSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
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
