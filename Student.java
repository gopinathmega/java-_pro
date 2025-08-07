
public class Student {
    String name;
    int age;
    String course;

    void setDetails(String studentName, int studentAge, String studentCourse) {
        name = studentName;
        age = studentAge;
        course = studentCourse;
    }

    void displayDetails() {
        System.out.println("Student Name  : " + name);
        System.out.println("Student Age   : " + age);
        System.out.println("Student Course: " + course);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDetails("Varshini", 20, "Computer Science");
        student1.displayDetails();

        System.out.println(); 

        
        Student student2 = new Student();
        student2.setDetails("Arun", 21, "Electronics");
        student2.displayDetails();
    }
}
