import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class d4t4p9 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1.Stack" +
                "2.Queue");
        System.out.println("Enter your choice:");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Stack_in();
                break;
            case 2:
                queue();
                break;
        }
            }

    private static void Stack_in() {
        Stack<Integer> stk = new Stack<>();
        stk.push(11);
        stk.push(13);
        stk.push(14);
        stk.push(44);
        System.out.println(stk);
        //deleting stack
        if (stk.contains(14))
            stk.pop();
        else
            stk.push(55);
        System.out.println("The first element in the Stack is: "+stk.peek());
        System.out.println(stk);
        //Searching in the Stack
        System.out.print("Enter the searching element:");
        Integer element = input.nextInt();
        Integer position = (Integer) stk.search(element);
        if(position == -1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element position number is: "+ position);
        }
        System.out.println(stk);

    }
    public static void queue(){
        PriorityQueue<String> que=new PriorityQueue<String>();
        que.add("Ameer");
        que.add("Vijay");
        que.add("Karan");
        que.add("Santosh");
        que.add("Ramiya");
        System.out.println("head:"+que.element());
        System.out.println("head:"+que.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=que.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        que.remove();
        que.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=que.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}


