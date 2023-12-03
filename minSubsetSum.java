// Minimum Subset sum difference problem with Subset partitioning

import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        int[] arr = {34, 45, 12, 4, 5, 2};
        findMinSubsetSumDiff(arr);
    }
 
    public static void findMinSubsetSumDiff(int[] arr) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
 
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][totalSum + 1];
 
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
 
        for (int i = 1; i <= totalSum; i++) {
            dp[0][i] = false;
        }
 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= totalSum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (arr[i - 1] <= j) {
                    dp[i][j] |= dp[i - 1][j - arr[i - 1]];
                }
            }
        }
 
        int diff = Integer.MAX_VALUE;
        for (int j = totalSum / 2; j >= 0; j--) {
            if (dp[n][j]) {
                diff = totalSum - (2 * j);
                break;
            }
        }
 
        int subset1Sum = (totalSum + diff) / 2;
        int subset2Sum = totalSum - subset1Sum;
        int[] subset1 = new int[n];
        int[] subset2 = new int[n];
        int i_ = n;
        int j_ = subset1Sum;
        int index1 = 0, index2 = 0;
        while (j_ > 0 && i_ > 0) {
            if (dp[i_ - 1][j_] == false) {
                subset1[index1] = arr[i_ - 1];
                index1++;
                j_ -= arr[i_ - 1];
            } else {
                subset2[index2] = arr[i_ - 1];
                index2++;
            }
            i_--;
        }
 
        System.out.println("Min Difference: " + diff);
        System.out.print("Subset 1: ");
        for (int k = index1 - 1; k >= 0; k--) {
            System.out.print(subset1[k] + " ");
        }
        System.out.print("\nSubset 2: ");
        for (int k = index2 - 1; k >= 0; k--) {
            System.out.print(subset2[k] + " ");
        }
    }
}
