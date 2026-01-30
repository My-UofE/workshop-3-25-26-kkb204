import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = in.nextInt();

        int rows = size * 2;
        int cols = size * 2;

        for (int row = 0; row < rows; row++) {
            String numbers = ""; 
            int start = 1 + Math.min(row, rows - 1 - row);

            for (int col = 0; col < cols; col++) {
                int num = start + Math.min(col, cols - 1 - col);
                numbers += num;
            }
            System.out.println(numbers);
        }

        in.close();
    }
}
