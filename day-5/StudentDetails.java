package comk.techzenure.services;
import java.util.Scanner;

class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    
    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student's Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Student's Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student's address: ");
        String studentAddress = scanner.nextLine();

        String isFromNIT;
        String collegeName = null;

        while (true) {
            System.out.print("Whether the student is from NIT(Yes/No): ");
            isFromNIT = scanner.nextLine().toLowerCase();
            if (isFromNIT.equals("yes")) {
                
                break;
            } else if (isFromNIT.equals("no")) {
                
                System.out.print("Enter the college name: ");
                collegeName = scanner.nextLine();
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }

        if (collegeName != null) {
            Student student = new Student(studentId, studentName, studentAddress, collegeName);
            displayStudentDetails(student);
        } else {
            Student student = new Student(studentId, studentName, studentAddress);
            displayStudentDetails(student);
        }

        scanner.close();
    }

    public static void displayStudentDetails(Student student) {
        System.out.println("Student id: " + student.getStudentId());
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());
    }
}

