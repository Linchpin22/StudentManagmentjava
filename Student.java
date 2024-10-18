import java.util.ArrayList;

class Student {
    private String name;
    private int id;
    private ArrayList<Integer> marks;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.marks = new ArrayList<>();
    }

    // Method to add marks
    public void addMark(int mark) {
        marks.add(mark);
    }

    // Method to calculate average marks
    public double getAverageMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (marks.size() > 0) ? (double) total / marks.size() : 0;
    }

    // Getters for name and ID
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Average Marks: " + getAverageMarks());
    }
}
