import java.util.*;

public class check_the_subarray{
    public static void main(String[] args) {
        int a[]= { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };
        int start_index=0;
        int end_index=0;
        //To convert an array into list
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                //list for sub array
                ArrayList<Integer> array=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    array.add(a[k]);
                }
                //System.out.println(array);
                Collections.sort(array);
                if(isConsecutive(array)&&array.size()>result.size()){
                    start_index=i;
                    end_index=j;
                    result=array;
                   // System.out.println("start="+start_index);
                    //System.out.println("End="+end_index);
                }
            }
        }
        //System.out.println(result);
        System.out.println("The largest sub-array is ["+start_index+", "+end_index+"]");
    }
    static boolean isConsecutive(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) + 1 != array.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}