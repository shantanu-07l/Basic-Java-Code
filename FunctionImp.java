public class FunctionImp {

    // Function to calculate and print the sum of all odd numbers from 1 to n
    public static void sumOddNumbers(int n) {
        int sum = 0;

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                sum += i; // Add the odd number to sum
            }
        }

        // Print the sum of all odd numbers
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        int n = 10; // Example value of n
        sumOddNumbers(n); // Call the function with n
    }
}
