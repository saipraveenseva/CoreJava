import java.time.LocalDate;
import java.util.*;

class Student{
    private String rollno;
    private String name;
    private String branch;
    private static int count=101; // static counter creates an incrementing number that can be added to the roll no to generate roll numbers.

    private String generateRollNo(String branch){
        LocalDate d = LocalDate.now();
        String rn = branch+(d.getYear()+"-"+count); // I created a pattern. roll number should be branch ID followed by joining year and incrementing roll number.
        count++;                                    // CS2024-101
        return rn;
    }

    public Student(String name, String branch){
        rollno = generateRollNo(branch);
        this.name=name;
        this.branch=branch;
    }

    public void getDetails(){
        System.out.println(rollno + " " + name + " "+ branch);
    }
}
public class StaticChallenge {

    public static void main(String[] args) {
        Student s1 = new Student("Sai praveen Seva","CS");
        Student s2 = new Student("Raja Gopala Rao Seva","ME");
        s1.getDetails();
        s2.getDetails();
    }
}
