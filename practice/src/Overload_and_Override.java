public class Overload_and_Override {
    public static void main(String[] args) {
        overload obj = new overload();
        override obj2= new override();
        int a =10;
        int b=20;
        int c=30;
        System.out.println("******** Over Load *********");
        System.out.println("The o/p of 3 parameter: "+obj.overload(a,b,c));
        System.out.println("The o/p of 2 parameter: "+obj.overload(a,c));
        System.out.println("******** Over Ride *********");
        System.out.println("The o/p of 2 parameter: "+obj2.over(a,b));
    }
}
class overload{
    public int overload(int a,int c){
        c=a+c;
        return a;
    }
    public int overload(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    public int over(int a,int b){
        return a+b;
    }
}
class override extends overload {
    public int over(int a, int b) {
      int  c = b - a;
        return c;
    }
}