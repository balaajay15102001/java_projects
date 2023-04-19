public class Static_dynamic {
    public static void main(String[] args) {
    Parent obj = new Parent();
    obj.Subclass();
    Parent obj2=new Child();
    obj2.Subclass();


    }
}
class Parent{
    int i=100;
    void Subclass(){
        System.out.println("Static Binding...");
        System.out.println("The initial value is: "+i);
    }


}
class Child extends Parent{
    void Subclass(){
        System.out.println("Dynamic Binding...");
        System.out.println("After we enter the dynamic binding the initial value add with 100 :"+(i+100));
    }
}

