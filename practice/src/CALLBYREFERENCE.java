public class CALLBYREFERENCE {
    public static void refe(call_reference obj2){
        obj2.a=90;
        obj2.b=10;
        obj2.c = obj2.b+obj2.a;
    }
    public static void main(String[] args) {
        call_reference obj = new call_reference();
        obj.a=200;
        obj.b=500;
        System.out.println("The printed value is: "+obj.a);
        refe(obj);
        System.out.println("The printed value is: "+obj.c);
    }

}
class call_reference{
    int a,b,c;
}