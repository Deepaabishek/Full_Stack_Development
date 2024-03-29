import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 1;

        System.out.print("Enter the count: ");
        int num = input.nextInt();

        int[] ans = fibonacciSeries(num, a, b);
        System.out.println(Arrays.toString(ans) + " ");
        input.close();
    }

    public static int[] fibonacciSeries(int num, int a, int b) {
        int[] ans = new int[num];
        ans[0] = a;
        ans[1] = b;
        for (int i = 2; i < num; i++) {
            int temp = b;
            b = a + b;
            a = temp;

            ans[i] = b;
        }
        return ans;
    }
}
