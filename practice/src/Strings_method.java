public class Strings_method {
    static String ch="Good Boy";
    public static void main(String[] args) {
        charat();
        System.out.println();
        System.out.println("The length of the String is:"+ch.length());
        STRING_FORMAT();
    }
    static void charat(){
        for(int i=0;i<ch.length();i++)
            System.out.print(ch.charAt(i));
    }
    static void STRING_FORMAT(){
        float num = 12.33f;
        String change=String.format("The value of %f:",num);
        System.out.println("The value of the format Specifier: " +change);
    }
    static void subString(){
        String[] str={"Praveen Kumar",
                "Yuvraj Singh",
                "Harbhajan Singh",
                "Gurjit Singh",
                "Virat Kohli",
                "Rohit Sharma",
                "Sandeep Singh",
                "Milkha Singh"
        };
    }

}
