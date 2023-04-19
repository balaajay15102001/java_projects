import java.util.*;
public class Array_list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Vector<String> vec_list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //System.out.println(list);
        list.remove(2);
        //System.out.println(list);
        //System.out.println(list.get(2));
        list.add(2, 19);
        //System.out.println(list);
        //System.out.println(list.size());
        //Vector
        vec_list.add("10");
        vec_list.add("11");
        vec_list.add("12");
        //System.out.println(vec_list);
        //vec_list.addAll(list);
        //System.out.println(vec_list);
        Collections.sort(vec_list);
        //System.out.println(vec_list);
        Stack<Vector> st_num = new Stack<>();
        Vector<Integer> s = new Vector<>();
        Vector<String> str = new Vector<>();
        str.add("Bala");
        str.add("Ajay");
        str.add("Murugan");
        s.add(1);
        s.add(2);
        s.add(3);
        st_num.push(vec_list);
        //System.out.println(st_num);
        st_num.push(s);
        st_num.push(str);
        System.out.println(st_num);
        System.out.println(st_num.peek());
        int position = st_num.indexOf("[Bala, Ajay, Murugan]");
        System.out.println(position);
        Queue<String> que = new PriorityQueue<>();

    }
    }

