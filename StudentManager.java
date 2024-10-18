import java.util.ArrayList;

class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(String name, int id) {
        Student student = new Student(name, id);
        students.add(student);
        System.out.println("Student added: " + name);
    }

    // Remove a student by ID
    public void removeStudent(int id) {
        Student toRemove = null;
        for (Student student : students) {
            if (student.getId() == id) {
                toRemove = student;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student removed: ID " + id);
        } else {
            System.out.println("Student not found!");
        }
    }

    // Display all student details
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student student : students) {
                student.displayDetails();
            }
        }
    }

    // Add marks to a student by ID
    public void addMarksToStudent(int id, int mark) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.addMark(mark);
                System.out.println("Mark added to student ID: " + id);
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
