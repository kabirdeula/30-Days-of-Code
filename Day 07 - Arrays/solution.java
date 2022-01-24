import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N= input.nextInt();
        int[] array = new int[N];
        
        for(int i = 0; i < N; i++){
            array[i] = input.nextInt();
        }
        
        for(int i = N - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}