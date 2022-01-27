import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        int N = new Scanner(System.in).nextInt();
        int sum = 0, max = 0;
        while(N > 0){
            if (N % 2 == 1){
                sum++;
                if(sum > max){
                    max = sum;
                }
            }else{
                sum = 0;
            }
            N /= 2;
        }
        System.out.println(max);
    }
}