import java.util.Scanner;

public class java_JNI {
    static {
        //The static initializer invokes System.loadLibrary() to load the native library "area"
        // (which contains a native method called Area_of_circle())
        // during the class loading. It will be mapped to "area.dll" in Windows

        //dll-dynamic link library
        System.loadLibrary("area");
    }
    //native method which is called in c++
    private native void Area_of_circle(int radius);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To load the library by using JNI");
        System.out.println("Enter the radius:");
        int radius = in.nextInt();
        new java_JNI().Area_of_circle(radius);
    }
}
