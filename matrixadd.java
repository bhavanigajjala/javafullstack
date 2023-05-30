public class matrixadd {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3},
                {3, 6},
        };
        int[][] b = {
                {2, 9},
                {4, 8},
        };
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
