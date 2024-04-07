import java.util.ArrayList;

public class Student {
    public String fname, lname, email, address;
    public int IndexNumber;

    public ArrayList<Integer> grades = new ArrayList<>();
    public void addGrade (double grade){
        if(grades.size() >=20) {
            throw new
                    IllegalArgumentException("Moze miec max 20 ocen");

        }
    }




}
