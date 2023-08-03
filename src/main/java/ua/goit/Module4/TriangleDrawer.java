package ua.goit.Module4;

public class TriangleDrawer {
    public static void main(String[] args) {
        TriangleDrawer triangleDrawer = new TriangleDrawer();
        System.out.println(triangleDrawer.drawTriangle(100));
    }


    public String drawTriangle(int side) {
        int i = 0;
        String starLine = new String();
        while (i < side) {
            int j = 0;
            while (j < side - i) {
                    starLine = String.join("", starLine, "*");
                j++;
            }
            starLine = String.join("", starLine, "\n");
            i++;
        }
        return  starLine;
    }
}
