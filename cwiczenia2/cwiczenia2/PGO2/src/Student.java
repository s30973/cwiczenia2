import java.util.ArrayList;

public class Student {
    public String fname, lname, email, adress;
    public int IndexNumber;
    public StudentGroup studentGroup;
    public ArrayList<Double> grades;

    public Student(String name, int age, int Indexnumber, StudentGroup studentGroup) {
        this.fname = name;
        this.lname = lname;
        this.email = email;
        this.adress = adress;
        this.IndexNumber = IndexNumber;
        this.studentGroup = studentGroup;
        this.grades = new ArrayList<Double>();
    }
    public void addStudent(Student student) {
        if (this.students.size() >= 15) {
            throw new IllegalStateException("Max liczba osób w grupie to 15.");
        }
        for (Student existingStudent : this.students) {
            if (existingStudent.studentId.equals(student.studentId)) {
                throw new IllegalStateException("Nie można dodać dwa razy tego samego studenta do grupy.");
            }
        }
        this.students.add(student);
    }
    public void addGrade(double grade) {
        if(this.grades.size() >=20) {
            throw new IllegalArgumentException("Student może mieć max 20 ocen.");
        }
        this.grades.add(grade);
    }
    public double calculateAverage() {
        if (this.grades.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma ocen.");
}
        double sum = 0.0;
        for (double grade : this.grades) {
            sum += grade;
        }
        double rawAverage = sum / this.grades.size();
        double[] possibleValues = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double closestValue = possibleValues[0];
        double smallestDifference = Math.abs(rawAverage - possibleValues[0]);
        for (double value : possibleValues) {
            double currentDifference = Math.abs(rawAverage - value);
            if (currentDifference < smallestDifference) {
                smallestDifference = currentDifference;
                closestValue = value;
            }
        }
        return closestValue;
    }
}