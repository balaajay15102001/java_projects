import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class RightTriangle {
    public static void main(String args[])
    {
        List<Long> coins = new ArrayList<>();
        coins.add(2L);
        coins.add(5L);
        coins.add(8L);
        coins.add(3L);

        for (long i: coins) {
            int a, b;
            int x=0;
            a: for(a = 1; a < 50; a++) {
                for(b = 1; b <= a; b++) {
                    if(x==i){
                        break;
                    }else{
                        x++;
                    }
                }
                if(x==i){
                    break ;
                }
            }
            System.out.println(a);
        }

    }
}