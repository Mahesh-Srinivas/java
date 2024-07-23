import java.util.*;
public class bublesort {
    public static void main(String a[]){
        Scanner sc = new Scanner (System.in);
        //in oneline
        /* String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        
        int n = inputArr.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
         */
        System.out.print("Enter the length of the array:");
        int n = sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        per(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void per(int  arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
