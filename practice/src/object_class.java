public class object_class {
    //The Object class is the parent class of all the classes in java by default.
    // In other words, it is the topmost class of java.
    //
        static int a = 10, b=20;
        int c;
        // Constructor
        object_class()
        {
            System.out.println("Addition of 10 and 20 : ");
            c=a+b;
            System.out.println("Answer : "+c);
        }
        object_class(int x, int y)
        {
            System.out.println("Parameterized Constructors");
            System.out.println("Addition " +x+ " and " +y);
            c=x+y;
            System.out.println("Answer : "+c);
        }
        // Driver code
        public static void main(String args[])
        {
            System.out.println("1st object created...");
            object_class obj1 = new object_class();
            System.out.println("2nd object created...");
            object_class obj2 = new object_class(2,3);
            System.out.println("Objects are equal:" + obj1.equals(obj2));
        }
    }
    //equals(Object obj) is the method of Object class. This method is used to compare the given objects.
        // It is suggested to override equals(Object obj) method to get our own equality condition on Objects.


