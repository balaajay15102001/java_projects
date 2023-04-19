public class call_by_Value {
    public static void main(String[] args) {
       int a=10;
        int b=20;
        int c=50;
        System.out.println("Before call the method: "+"a="+a+" b="+b+" c="+c);
        int d=callbyvalue(a,b);
        System.out.println("After call the method: "+" a="+a+" b="+b+" c="+d);
    }
    static int callbyvalue(int a,int b){
        int c=a+b;
        return c;
    }

}
