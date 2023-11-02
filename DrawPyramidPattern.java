public class DrawPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Change 'n' to adjust the height of the pyramid

        // Outer loop to iterate through the rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Inner loop to print asterisks for the pyramid
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
