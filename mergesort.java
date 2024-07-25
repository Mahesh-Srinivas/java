import java.util.*;
class mergesort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("unsorted array: "+Arrays.toString(arr));
        mergesortk(arr,0,n-1);
        System.out.println("sorted array" + Arrays.toString(arr));
    }
    static void mergesortk(int arr[],int l,int r){
        if(l<r){
            int m = (l+r) / 2;
            mergesortk(arr, l, m);
            mergesortk(arr, m+1, r);
            merge(arr,l,m,r);
        }
    }
    static void merge(int arr[],int l,int m,int r){
        int i=l;
        int j=m+1;
        List<Integer> b = new ArrayList<>();
        while ((i<=m) && (j<=r)){
            if(arr[i]<=arr[j]){
                b.add(arr[i]);
                i++;
            }
            else{
                b.add(arr[j]);
                j++;
            }
        }
        while(i<=m){
            b.add(arr[i]);
            i++;
        } while(j<=r){
            b.add(arr[j]);
            j++;
        }
        for(int k=0;k<b.size();k++){
            arr[k+l]= b.get(k);
        }

    }
}