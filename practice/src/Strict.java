public class Strict {

        // Method 1
        // Calculating sum using strictfp modifier
        public strictfp double sum()
        {

            float num1 = 10;
            float num2 = 6;

            // Returning the sum
            return (num1 + num2);
        }
        public static void main(String[] args)
        {

            Strict t = new Strict();
            System.out.println(t.sum());
        }

}
