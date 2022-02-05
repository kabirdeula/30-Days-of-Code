import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1; i <=n; i++){
            if(n%i == 0) sum +=i;
        }
        return sum;
    }
}

class Solution{

    public static void main(String[] args){
        int n = new Scanner(System.in).nextInt();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}