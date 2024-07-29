package hncdev.array;

public class LocalMaximum {

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        max = Math.max(max, grid[i + k][j + l]);
                    }
                }
                maxLocal[i][j] = max;
            }
        }

        return maxLocal;
    }

    public static void main(String[] args) {
        LocalMaximum maximum = new LocalMaximum();
        int[][] grid = {
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}
        };

        int[][] result = maximum.largestLocal(grid);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
