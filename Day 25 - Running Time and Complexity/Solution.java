import java.util.Scanner;

public class Solution {

    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 0; i < T; i++){
            int n = input.nextInt();

            if(n >= 2 && isPrime(n))
                System.out.println("Prime");
            else System.out.println("Not prime");
        }
        input.close();
    }
}