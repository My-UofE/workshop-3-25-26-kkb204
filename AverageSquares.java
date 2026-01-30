import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        double num_of_squares = (endNum - startNum)+1;
        double total = 0;
        int i = 0;
        do {
            total += i*i;
            ++i;
        } while (i <= endNum);
        
        double average = total / num_of_squares;
        System.out.println(average);
    }
}