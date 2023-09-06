import java.util.Scanner;

public class Tinkoff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] grid = new int[n][m];
        int num = 11;
        for (int i = 0; i < n + m - 1; i++) {
            for (int j = 0; j < m; j++) {
                int k = i - j;
                if (k >= 0 && k < n) {
                    grid[k][j] = num++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}