public class Student {

    public int roll;
    public String name;
    public String course;
    public int m1;
    public int m2;
    public int m3;

    public double total(){
        return m1+m2+m3;
    }

    public double average(){
        return (double) (m1 + m2 + m3) /3;
    }

    public char grade(double average){
        if(average>=90){
            return 'A';
        }
        if(average<90 && average>=35){
            return 'B';
        }
        if(average<35){
            return 'F';
        }
        return 'X';
    }

    public static void main(String[] args) {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1.roll=101;
        s1.name="Sai";
        s1.course="CSE";

        s2.roll=102;
        s2.name="Praveen";
        s2.course="ECE";

        s3.roll=103;
        s3.name="Seva";
        s3.course="EEE";

        s1.m1=90;
        s1.m2=85;
        s1.m3=100;

        s2.m1=65;
        s2.m2=55;
        s2.m3=65;

        s3.m1=20;
        s3.m2=20;
        s3.m3=10;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.course);
        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade(s1.average()));

        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.course);
        System.out.println(s2.total());
        System.out.println(s2.average());
        System.out.println(s2.grade(s2.average()));

        System.out.println(s3.roll);
        System.out.println(s3.name);
        System.out.println(s3.course);
        System.out.println(s3.total());
        System.out.println(s3.average());
        System.out.println(s3.grade(s3.average()));

    }

}
