package semester1.practice06;

public class Matrix2D {
    private int[][] grid;

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void printMatrix() {
        for (int[] row : grid) {
            for (int i = 0; i < row.length; i++) {
                System.out.printf("%4d", row[i]);
                if (i < row.length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int getTotalSum() {
        int sum = 0;
        for (int[] row : grid) {
            for (int val : row) {
                sum += val;
            }
        }
        return sum;
    }

    public int getRowSum(int rowIndex) {
        int sum = 0;
        for (int val : grid[rowIndex]) {
            sum += val;
        }
        return sum;
    }
}
