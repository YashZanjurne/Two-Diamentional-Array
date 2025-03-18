// Sum of two d array

import java.util.Scanner;

public class TwoDArray2 {
    public TwoDArray2() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the Array Elements");

        int sum;
        int i;
        for(sum = 0; sum < 3; ++sum) {
            for(i = 0; i < 3; ++i) {
                arr[sum][i] = sc.nextInt();
            }
        }

        sum = 0;

        for(i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}

