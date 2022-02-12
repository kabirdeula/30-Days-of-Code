import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int da = input.nextInt();
        int ma = input.nextInt();
        int ya = input.nextInt();

        int de = input.nextInt(); 
        int me = input.nextInt();
        int ye = input.nextInt();

        int fine = 0;

        if(ya > ye) fine = 10000;
        else if (ya == ye){
            if (ma > me) fine = (ma - me) * 500;
            else if (ma == me && da > de) fine = (da - de) * 15;
        }
        System.out.println(fine);
    }
}