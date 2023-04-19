public class java_object implements Cloneable {
        //namma indha Clonable key words illana namalala clone function call panna mudiyadhu
        // declare variables
        String name;
        int age;
        public static void main(String[] args) {

            // create an object of java_object class
            java_object obj1 = new java_object();

            // initialize name and version using obj1
            obj1.name = "Bala";
            obj1.age = 14;

            // print variable
            System.out.println(obj1.name);    // Bala
            System.out.println(obj1.age);    // 14
            //statement allows you to define a block of code to be tested for errors while it is being executed.
            try {

                // create clone of obj1
                java_object obj2 = (java_object) obj1.clone();
                System.out.println("Before changing the cloned values: ");
                System.out.println(obj2.name);      // Bala
                System.out.println(obj2.age);       //14
                //we have used (java_object) to convert it into Main type
                System.out.println("After changing the cloned values: ");
                obj2.name = "Nizar";
                obj2.age = 20;


                // print the variables using obj2
                System.out.println(obj2.name);      // Nizar
                System.out.print(obj2.age);   // 20
            }
            catch (Exception e) {
                System.out.println("Thank you");
            }

        }
    }

