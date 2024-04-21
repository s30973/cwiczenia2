import java.util.ArrayList;

public class StudentGroup {
    public String fname, lname, email, adress;
    public int IndexNumber;
    public ArrayList<Student> students;

    public Student(String name, int age, int Indexnumber, StudentGroup studentGroup)  {
            this.fname = name;
            this.lname = lname;
            this.email = email;
            this.adress = adress;
            this.IndexNumber = IndexNumber;
            this.students = new ArrayList<Student>();
        }

        public void addStudent(Student student) {
            this.students.add(student);
        }
    }
}
