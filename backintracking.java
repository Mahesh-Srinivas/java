import java.util.*;
public class backintracking {
    public static void per(String s, String pe,int i ){
        if(s.length()==0){
            System.out.println(pe);
            return;
        }
        for(int j =0;j<s.length();j++){
            char c = s.charAt(j);
            String n = s.substring(0,j) + s.substring(j+1);
            per(n,pe + c,i+1);
        }
    }
    public static  void main (String []a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        System.out.println("The permutations:");
        per(s,"",0);
    }
}
