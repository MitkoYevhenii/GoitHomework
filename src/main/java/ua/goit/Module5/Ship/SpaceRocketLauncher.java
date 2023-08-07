package ua.goit.Module5.Ship;

public class SpaceRocketLauncher {
    // private fields with a number of missiles
    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount > 0 && bigRocketCount <= 100) {
            this.bigRocketCount = bigRocketCount;
        }
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount > 0 && smallRocketCount <= 100 ) {
            this.smallRocketCount = smallRocketCount;
        }
    }


    // launch big and small rocket on ship.
    //takes away bigRocketCount and smallRocketCount and print Launch big/small rocket
    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            bigRocketCount--;
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket() {
        if (smallRocketCount >  0) {
            smallRocketCount--;
            System.out.println("Launch small rocket");
        }
    }

    // counts the number of missiles according to the formula: 100 * bigRocketCount + 50 * smallRocketCount
    public int getTotalPower() {
        return 100 * bigRocketCount + 50 * smallRocketCount;
    }

    public static void main(String[] args) {
        SpaceRocketLauncher shipRockets = new SpaceRocketLauncher();

        shipRockets.setBigRocketCount(5);
        shipRockets.setSmallRocketCount(9);

        shipRockets.launchBigRocket();
        System.out.println("Сумарная мощь корабля: " + shipRockets.getTotalPower());
    }
}

