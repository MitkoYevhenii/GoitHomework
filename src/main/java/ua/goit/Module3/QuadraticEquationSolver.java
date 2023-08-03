package ua.goit.Module3;

import java.util.Arrays;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c){

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {

            double[] equationSolutions = new double[2];
            equationSolutions[0] = (-b - Math.sqrt(discriminant)) / (2 * a);
            equationSolutions[1] = (-b + Math.sqrt(discriminant)) / (2 * a);
            return equationSolutions;
        } else if (discriminant == 0) {
            return new double[]{(-b + Math.sqrt(discriminant)) / (2 * a)};
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver quadraticEquationSolver = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(6, -36, 30)));
    }
}
