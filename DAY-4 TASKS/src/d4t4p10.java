import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class d4t4p10 {
        public static void main(String args[]){
            Map<Integer,String> map=new HashMap<Integer,String>();
            map.put(101,"Ameer");
            map.put(102,"Vishal");
            map.put(103,"Ragul");
            //Elements can traverse in any order
            for(Map.Entry m:map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }

