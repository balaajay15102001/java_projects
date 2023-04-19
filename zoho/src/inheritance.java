public class inheritance {
    String name;
    int age;
    public static void main(String[] args) {
        Student1 obj1 =new Student1();
        Student2 obj2 = new Student2();
        obj1.name("john",20);
        //obj2.age(19);
        obj2.name("Bala",20);
        //obj2.age(20);
    }
}
class Student{
   void age(int age){
        System.out.println(age);
    }
}
class Student1 extends  Student{
    void name(String a,int b){
        System.out.println(a);
        super.age(b);
    }
}
class Student2 extends Student{
    void name(String a,int b){
        System.out.println(a);
        super.age(b);
    }
}
