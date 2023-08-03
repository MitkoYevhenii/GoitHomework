package ua.goit.Module4;

public class CheapStocks {
    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();
    }


    public String getCheapStocks(String[] stocks) {

        int[] stocksCosts = new int[stocks.length];
        String[] stocksNames = new String[stocks.length];

        for (int i = 0; i < stocks.length; i++) {
            String[] splitArray = stocks[i].split(" ");
            stocksNames[i] = splitArray[0];
            stocksCosts[i] = Integer.parseInt(splitArray[1]);
        }

        int index = 0;
        for (int cost : stocksCosts) {
            if (cost < 200) {index++;}
        }

        String[] stocksNamesUpdate = new String[index];
        for (int i = 0, k = 0; i < stocks.length; i++) {
            if (stocksCosts[i] < 200) {
                stocksNamesUpdate[k] =  stocksNames[i];
                k++;
            }
        }
        return String.join(" ", stocksNamesUpdate);
    }
}
