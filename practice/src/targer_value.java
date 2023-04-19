public class targer_value {
    static int i,j;
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==6){
                    System.out.println("The addition of \""+arr[i]+"\" and \""+arr[j]+"\" is 6.");
                }
            }
        }
    }
}
