import java.util.Scanner;

public class inserctionsort {
      public static void main(String args[])
    {
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
        System.out.print("Enter the length:");
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
        for(int i=1;i<arr.length;i++){
            int c =arr[i];
            int j =i-1;
            while(j>=0 && c<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=c;
        }
    }
}

