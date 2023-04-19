public class students {
    public static void main(String[] args) {
       Student_A obj1 = new Student_A(70f,80f,80.5f,97.5f);
        System.out.println("The average mark of student A: "+String.format("%.2f",obj1.getPercentage()));
        Student_B obj2 = new Student_B(80f,75f,89f);
        System.out.println("The average mark of student B: "+String.format("%.2f",obj2.getPercentage()));
    }
}
abstract class student{
    abstract float getPercentage();
}
    class Student_A extends student{
        float sub_1,sub_2,sub_3,sub_4;
        float percentage =0;
        Student_A(float a, float b,float c,float d){
        sub_1= a;
        sub_2 =b;
        sub_3 =c;
        sub_4 = d;

    }
        float getPercentage() {
            percentage = (sub_1+sub_2+sub_3+sub_4)/4;
            return  percentage;

        }
    }
    class Student_B extends student{
    float sub1,sub2,sub3;
    float percentage =0;
    Student_B(float a,float b,float c) {
        sub1 = a;
        sub2 = b;
        sub3 = c;
    }
        @Override
        float getPercentage() {
            percentage = (sub1+sub2+sub3)/3;
            return percentage;
        }
    }

