package ua.goit.Module4;

import java.util.Arrays;

public class UberShop {

    // Виводить список на екран та додає в кінці "jup."
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(String.join(" ", String.valueOf(price), "jup."));
        }
    }

    //множить елеменнт списку на 2, якщо ціна товару менша ніж 1000
    //множить елеменнт списку на 1.5, якщо ціна товару більша або дорівнює ніж 1000
    public void multiplyPrices(float[] prices) {
        System.out.println(Arrays.toString(prices));
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000f) {
                prices[i] *= 2;
            } else if (prices[i] >= 1000f) {
                prices[i] *= 1.5f;
            }
        }
        System.out.println(Arrays.toString(prices));
    }

    // Повертає список із мінімальним та максимальним значенням
    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[]{};
        } else if (prices.length == 1) {
            return prices;
        } else if (prices[0] == prices[1]) {
            return new int[]{prices[0]};
        } else {
            int[] minMaxPrisces = {prices[0], prices[1]};
            for (int price : prices) {
                if (price < minMaxPrisces[0]) {
                    minMaxPrisces[0] = price;
                } if (price > minMaxPrisces[1]) {
                    minMaxPrisces[1] = price;
                }
            }
            return minMaxPrisces;
        }
    }

    //Повертає мінімальну кількість цін
    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = findMinMaxPrices(prices)[0];
        int minPriceSum = 0;
        for (int price : prices) {
            if (price == min) {
                minPriceSum++;
            }
        }
        return minPriceSum;
    }

    //Прибирає задану ціну із списку
    public int[] removePrice(int[] prices, int toRemove) {
        if (prices.length == 0) {
            return new int[]{};
        }

        else {
            int toRemovePriceSum = (int) Arrays.stream(prices).filter(num -> num == toRemove).count();
            int[] newPrices = new int[prices.length - toRemovePriceSum];
            int k = 0;
            for (int price : prices) {
                if (price != toRemove) {
                    newPrices[k] = price;
                    k++;
                }
            }
            return newPrices;
        }
    }

    public int[] leavePrice9(int[] prices) {
        int count = 0;

        for (int price : prices) {
            if (price % 10 == 9){
                count++;
            }
        }

        int[] newPrices = new int[count];
        int index = 0;

        for (int price : prices) {
            if (price % 10 == 9) {
                newPrices[index] = price;
                index++;
            }
        }
        return newPrices;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
            String[] mergeAndWarehouseStocks = new String[showcaseStocks.length + warehouseStocks.length];

            if(showcaseStocks.length == 0) {
                return warehouseStocks;
            } else if (warehouseStocks.length == 0) {
                return showcaseStocks;
            }

            for (int i = 0; i < showcaseStocks.length; i++) {
                mergeAndWarehouseStocks[i] = showcaseStocks[i];
            }

            for (int i = 0; i < showcaseStocks.length; i++) {
                mergeAndWarehouseStocks[i + showcaseStocks.length] = warehouseStocks[i];
            }
            return mergeAndWarehouseStocks;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int count = 0;

        for (int prise : prices) {
            if (minPrice <= prise && maxPrice >= prise) {
                count++;
            }
        }

        int[] newPrices = new int[count];
        int index = 0;

        for (int prise : prices) {
            if (minPrice <= prise && maxPrice >= prise) {
                newPrices[index] = prise;
                index++;
            }
        }

        int pricesSum = 0;
        for (int newPrice: newPrices) {
            pricesSum += newPrice;
        }
            return pricesSum;
    }

    public static void main(String[] args) {
        UberShop uberShop = new UberShop();
        System.out.println(uberShop.getPricesSum(new int[] {10, 700, 50, 500}, 10, 50));
    }
}

