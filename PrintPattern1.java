import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = in.nextInt();
        String numbers = "";
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                numbers += row; break;
            }
            System.out.println(numbers);
        }
    }
    }