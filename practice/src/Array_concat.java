import  java.util.*;
public class Array_concat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ënter the value of n: ");
        int n= input.nextInt();
        int[]integer = new int[n];
        System.out.print("Ënter the value of m: ");
        int m= input.nextInt();
        int [] int2=new int[m];
        for (int i=0;i<n;i++){
            System.out.print("a:");
            integer[i]= input.nextInt();
        }
        for (int j=0;j<m;j++){
            System.out.print("b:");
            int2[j]= input.nextInt();
        }
        int[] res=new int[n+m];
        System.arraycopy(integer,0,res,0,n);
        System.arraycopy(int2,0,res,n,m);
        for(int i:res){
            System.out.print("\t"+i);
        }
    }
}
