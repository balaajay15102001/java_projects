import java.sql.SQLOutput;

public class Overriding {
    public static void main(String[] args) {
       // Parent1 obj1 = new Parent1();
        Parent1 obj2 = new Parent2();
       // obj1.child1();
        obj2.child1();
        obj2.child2();
    }
}
class Parent1{
    int i=100;
    void child1(){
        System.out.println("The child one is the Best..");
    }
    //child2 print like as Overriding
    public static void child2(){
        System.out.println("By using Static Method..");
        System.out.println("There it is in parent 1----child 2---class");
    }
}
class Parent2 extends Parent1{
    //child2 is print because of final by using overriding..
     final void child1(){
         System.out.println("By using Final Method:");
        System.out.println("it will print the final because of Over riding...."+(super.i+100));
    }
    public static void child2(){


    }
}

