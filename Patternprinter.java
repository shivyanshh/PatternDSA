public class Patternprinter {
     public static void main(String[] args) {
        int n = 7; // Size of the pattern (number of rows/columns)

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {

                // The number to be printed depends on the minimum distance from any edge
                // The minimum distance to any of the 4 edges is:
                // from top = i
                // from bottom = n - 1 - i
                // from left = j
                // from right = n - 1 - j
                // So take the minimum of all these distances and subtract it from the max value (4)
                int min = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print((4 - min) + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
