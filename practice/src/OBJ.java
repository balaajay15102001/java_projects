public class OBJ {
    public static void main(String[] args) {
        ex_class object = new ex_class("Bala",18);
        object.name ="Nizar";
        object.age = 65;
        ex_class object2 =new ex_class(object.name, object.age);
        object.exr();
    }
}
class ex_class{
    String name;
    int age;
    ex_class(String name,int age){
        System.out.println("The name is \""+name+"\" and his age is "+age);
        //System.out.println("It is the basic example of OBJECT AND CLASS...");
    }
    void exr(){
        System.out.println("The name is \""+name+"\" and his age is "+age);
    }
}