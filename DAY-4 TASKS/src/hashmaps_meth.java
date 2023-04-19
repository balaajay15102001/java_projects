import java.util.HashMap;

public class hashmaps_meth {
    public static void main(String[] args) {
        HashMap<Integer,String> hash = new HashMap<>();
        //put
        hash.put(1,"Ammu");
        hash.put(2,"Dumble");
        hash.put(3,"Alien");
        hash.put(4,"Samit");
        hash.put(5,"Ramesh");
        // 2 Hash method
        HashMap<Integer,String> hash2 = new HashMap<>();
        hash2.put(6,"Amirtha");
        hash2.put(2,"Divya");
        hash2.put(7,"Anu");
        hash2.put(8,"Samantha");
        hash2.put(9,"Rajesh");
        System.out.println(hash);
        //Keys
        System.out.println("Keys: "+hash.keySet());
        //values
        System.out.println("Values: "+hash.values());
        //updated list
        hash.putAll(hash2);
        System.out.println("The updated list are: "+hash);
        //by using merge condition.
        hash.forEach((key,value)->hash2.merge(key,value,(oV,nV)->oV+","+nV));
        System.out.println("The merge values are"+hash2);

        //changing element
        hash.put(6,"vidhya");
        hash.replace(7,"lalitha");
        hash.replace(9,"Rajesh","Gayathri");
        System.out.println("After replace the map: "+hash);

        // Getting the hashcode value for the map
        System.out.println("The Hashcode value is: "+hash.hashCode());

        //get
        System.out.println("To get the result of finding value of 6 is : "+hash.get(6));

        //Compute method
        hash.compute(9,(key,value)->value.concat(" Sri"));
        System.out.println("After compute the map: "+hash);

        //clone
        HashMap<Integer,String> clone_hash =new HashMap<>();
        clone_hash = (HashMap<Integer, String>) hash.clone();
        clone_hash.remove(7);
        clone_hash.remove(8);
        clone_hash.remove(9);
        System.out.println("After clone the hash map: "+clone_hash.entrySet());
        clone_hash.computeIfPresent(6,(key,value)->(key == 6)?"aju" :"Karkku" );
        System.out.println(clone_hash);
    }
}
