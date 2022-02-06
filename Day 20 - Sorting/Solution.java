import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }

        int numSwaps = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    numSwaps++;
                }
            }

            if(numSwaps == 0){
                break;
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: "+ array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
    }
}
