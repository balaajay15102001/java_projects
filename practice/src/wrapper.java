public class wrapper {
    //The objects are necessary if we wish to modify the arguments passed into the method
    // because primitive types are passed by value.
    public static void main(String args[]){
        int i=30;
        long l=40;
        float f=30.0F;
        double d=50.0D;
        char c='a';
//Autoboxing->Converting primitives into objects
// The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing
        Integer int_obj=i;
        bala obj = new bala();
        obj.bala(int_obj);
        Long long_obj=l;
        Float float_obj=f;
        Double double_obj=d;
        Character char_obj=c;
//Printing coverted obj
        System.out.println("*******Printing object value*******");
        System.out.println("Integer object: "+int_obj);
        System.out.println("Long object: "+long_obj);
        System.out.println("Float object: "+float_obj);
        System.out.println("Double object: "+double_obj);
        System.out.println("Character object: "+char_obj);

//Unboxing->Converting Objects to Primitives
// The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing
        int intvalue=int_obj;
        long longvalue=long_obj;
        float floatvalue=float_obj;
        double doublevalue=double_obj;
        char charvalue=char_obj;
//Printing converted primitive obj
        System.out.println("int value: "+intvalue);
        System.out.println("long value: "+longvalue);
        System.out.println("float value: "+floatvalue);
        System.out.println("double value: "+doublevalue);
        System.out.println("char value: "+charvalue);
    }
}
class bala{
    public static int bala(Integer a){
        int bala = a;
        return bala;
    }
}
