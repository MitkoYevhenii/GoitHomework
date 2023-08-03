package ua.goit.Module4;

public class ArlanHelper {
    public static void main(String[] args) {
        ArlanHelper arlanHelper = new ArlanHelper();
//        System.out.println(arlanHelper.drawRect(2, 3, 'h'));
//        System.out.println(arlanHelper.drawLine(5));
        System.out.println(arlanHelper.drawPattern(new char[] {'q', 'd', 'm', 't', 'h', 'u', 'k'}, 9));
    }


    public String drawRect(int width, int height, char charString) {
        String starsSquareString = "";
        int i = 0;
        while(i <= height - 1) {
            int j = 0;
            while (j <= width - 1) {
                starsSquareString = String.join("", starsSquareString, String.valueOf(charString));
                j++;
            }
            starsSquareString = String.join("", starsSquareString, "\n");
            i++;
        }
        return starsSquareString;
    }


    public String drawLine(int length) {
        int i = 0;
        String line = "";
        char[] starLatticeList = {'*', '#'};

        while (i < length) {
            line = String.join("", line,  String.valueOf(starLatticeList[i % 2] + 1));
            i++;
        }
        return line;
    }


    public String drawPattern(char[] pattern, int repeatCount) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        int patternLength = pattern.length;

        while (count < repeatCount) {
            int i = 0;
            while (i < patternLength) {
                stringBuilder.append(pattern[i]);
                i++;
            }
            count++;
        }

        return stringBuilder.toString();
    }
}

