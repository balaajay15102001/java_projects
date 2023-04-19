public class javaBean {
    public static void main(String args[])
    {
        Student s = new Student(); // object is created
        s.setName("JavaBeans"); // setting value to the object
        System.out.println(s.getName());
        s.setId(12);
        System.out.println(s.getId());
    }
}
