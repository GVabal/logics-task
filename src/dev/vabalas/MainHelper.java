package dev.vabalas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainHelper {

    /**
     * Takes file with numbers pyramid and parses it into two-dimensional array.
     */
    public static int[][] preparePyramidFromFile(String path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] pyramid = new int[lines.size()][lines.size()];

        int row = 0;
        for (String line : lines) {
            String[] linePieces = line.split(" ");
            for (int i = 0; i < linePieces.length; i++) {
                pyramid[row][i] = Integer.parseInt(linePieces[i]);
            }
            row++;
        }

        return pyramid;
    }

    /**
     * Takes int[][] pyramid and calculates maximum sum of the numbers per these rules:
     * <p>1. Start from the top and move downwards to an adjacent number.</p>
     * <p>2. You are only allowed to walk downwards and diagonally.</p>
     * <p>3. You should walk over the numbers as evens and odds subsequently. (Odd -> Even -> Odd -> Even...).</p>
     * <br>
     * This method assumes that there will be at least 1 valid path.</p>
     */
    public static int findMaximumSum(int[][] pyramid) {
        int root = pyramid[0][0] % 2;
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    if (pyramid[i][j] % 2 != root) pyramid[i][j] = -1;
                } else {
                    if (pyramid[i][j] % 2 == root) pyramid[i][j] = -1;
                }
            }
        }

        for (int i = pyramid.length - 2; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
                if (pyramid[i][j] >= 0) {
                    if (pyramid[i + 1][j] < 0 && pyramid[i + 1][j + 1] < 0) {
                        pyramid[i][j] = -1;
                    } else if (pyramid[i + 1][j] >= 0 && pyramid[i + 1][j + 1] < 0) {
                        pyramid[i][j] += pyramid[i + 1][j];
                    } else if (pyramid[i + 1][j] < 0 && pyramid[i + 1][j + 1] >= 0) {
                        pyramid[i][j] += pyramid[i + 1][j + 1];
                    } else {
                        pyramid[i][j] += Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
                    }
                }
            }
        }

        return pyramid[0][0] + Math.max(pyramid[1][0], pyramid[1][1]);
    }
}
