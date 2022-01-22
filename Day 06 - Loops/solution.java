import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        int n = new Scanner(System.in).nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i +" = " + (n*i));
        }
    }
}