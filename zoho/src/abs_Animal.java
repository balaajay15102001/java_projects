public class abs_Animal {
    public static void main(String[] args) {
        Cat obj1 = new Cat();
        obj1.cat();
        Dog obj2 = new Dog();
        obj2.dog();
    }
}
abstract class Animal{
    abstract void cat();
    abstract void dog();
}
class Cat extends Animal {
    public void cat() {
        System.out.println("Cats meow");
    }
    void dog() {

    }
}
class Dog extends Animal{
    void cat(){

    }
    public void dog() {
        System.out.println("Dogs are bark");
    }
}

