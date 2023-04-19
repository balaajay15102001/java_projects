public class tar_subarray {
    static int i,j;
    public static void main(String[] args) {
        int[] arr={1,2,-2,3,4,5};
        int c=0;
        for(i=0;i<arr.length;i++) {
            int sum = 0;
            for (j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    c = 1;
                    break;
                }
            }
            if(c==1){
                System.out.println("True");
                break;
            }
        }

            if(c==0){
                System.out.println("false");
            }

    }
}
