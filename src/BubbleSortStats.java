import java.util.Scanner;
public class BubbleSortStats {
        static Scanner sc = new Scanner(System.in);
        // TODO: Read n
        // TODO: Read the array elements
        // TODO: Implement Bubble Sort
        // TODO: Keep track of the number of swaps
        // TODO: Print total swaps
        // TODO: Print the first element of the sorted array
        // TODO: Print the last element of the sorted array
        public static void main(String[] args) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                int swap = 0;
                for(int i=0; i<n-1; i++){
                        for(int j=0; j<n-i-1;j++){
                                if(arr[j]>arr[j+1]){
                                        int temp = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1] = temp;
                                        swap++;
                                }
                        }
                }
                System.out.println(swap);
                System.out.println(arr[0]);
                System.out.println(arr[n-1]);
        }
}
