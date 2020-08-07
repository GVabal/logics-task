package dev.vabalas;

public class Main {

    public static void main(String[] args) {

        int[][] pyramid = MainHelper.preparePyramidFromFile("src/dev/vabalas/input.txt");
        System.out.println("Answer: " + MainHelper.findMaximumSum(pyramid));

    }
}
