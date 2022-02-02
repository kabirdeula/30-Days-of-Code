import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        String string = new Scanner(System.in).next();
        try{
            Integer integer = Integer.parseInt(string);
            System.out.println(integer);
        }catch(NumberFormatException numberFormatException){
            System.out.println("Bad String");
        }
    }
}