import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        int n = new Scanner(System.in).nextInt();
        if(n%2 == 1 || (n%2==0 && n>=6 && n<=20))
        System.out.println("Weird");
        else if(n%2 == 0 && (n >= 2 && n<= 5) || n >= 20)
            System.out.println("Not Weird");
    }
}