
import java.util.ArrayList;
        import java.util.Scanner;

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }
}

class Course {
    private String name;
    private ArrayList<Student> students;
    private static final int MAX_STUDENTS = 10;

    public Course(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean isFull() {
        return students.size() >= MAX_STUDENTS;
    }
}

public class University {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public University() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void registerStudent(Student student, Course course) {
        if (student.getCourses().size() >= 5) {
            System.out.println("Error: Student has already registered for the maximum number of courses.");
        } else if (course.isFull()) {
            System.out.println("Error: Course is full.");
        } else {
            student.registerCourse(course);
            course.addStudent(student);
            System.out.println("Student successfully registered for course.");
        }
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println("Course: " + course.getName());
            System.out.println("Students: ");
            for (Student student : course.getStudents()) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        University university = new University();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Add course");
            System.out.println("3. Register student for course");
            System.out.println("4. Display courses");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.next();
                Student student = new Student(name);
            }
        }

    }
}
