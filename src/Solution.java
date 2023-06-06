import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String res = s.substring(0, k);
        String smallest = res;
        String largest = res;
        for (int i = 1; i < s.length() - k + 1; ++i) {
            res = s.substring(i, i + k);
            if (smallest.compareTo(res) > 0) {
                smallest = res;
            }
            if (largest.compareTo(res) < 0) {
                largest = res;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}