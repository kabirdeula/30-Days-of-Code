import java.util.Scanner;

class Difference{
    private int[] elements;
    public int maximumDifference;
    
    Difference(int[] elements){
        this.elements = elements;
    }
    
    public void computeDifference(){
        int max = 0;
        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                int abs = Math.abs(elements[i] - elements[j]);
                if(abs > max) max = abs;
            }
        }
    
        maximumDifference = max;
    }
}

public class Solution{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        input.close();
        
        Difference difference = new Difference(a);
        
        difference.computeDifference();
        System.out.println(difference.maximumDifference);
    }
}