import java.util.Scanner;
public class cakeMinator330A {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            char[][] cake = new char[r][c];

            for (int i = 0; i < r; i++) {
                cake[i] = scanner.nextLine().toCharArray();
            }

            // Output the result
            int result = maxCakeCells(r, c, cake);
            System.out.println(result);

            scanner.close();
        }

        // Function to find the maximum number of cake cells the cakeminator can eat
        private static int maxCakeCells(int r, int c, char[][] cake) {
            int[] rowEatable = new int[r];
            int[] colEatable = new int[c];

            // Count cake cells in each row
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (cake[i][j] == '.') {
                        rowEatable[i]++;
                    }
                }
            }

            // Count cake cells in each column
            for (int j = 0; j < c; j++) {
                for (int i = 0; i < r; i++) {
                    if (cake[i][j] == '.') {
                        colEatable[j]++;
                    }
                }
            }

            // Calculate the maximum number of cake cells that the cakeminator can eat
            int maxCells = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (cake[i][j] == '.') {
                        maxCells = Math.max(maxCells, rowEatable[i] + colEatable[j] - 1);
                    }
                }
            }
            return maxCells;
    }
}



