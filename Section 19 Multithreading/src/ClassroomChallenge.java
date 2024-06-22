

class Whiteboard{
    int value;
    int numberOfStudents=3; // 3 students in class

    int count=0;    // Initially the count=0 so the teacher can write on the whiteboard

    synchronized public void write(int v){
        while(count!=0){    // Teacher needs to wait if the count!=0 because students are still reading it
            try {
                wait();
            }catch(Exception e){}
        }

        value=v;        // Once the count==0 copy the contents of v that are sent as a parameter are copied into the variable value
        count=numberOfStudents; // The count is updated with the number of students yet to read it.
        notifyAll(); // Once the teacher is done with the writing they will inform all the students.
    }

    synchronized public int read(){
        while(count==0){    // Students needs to wait until the count!=0 because the teacher is yet to write
            try {
                wait();
            }catch(Exception e){}
        }
        int x=0;    // Once teacher has written on the whiteboard and count!=0, copy the contents of value to local variable x
        x=value;
        count--;    // If one student has read it, then count is decremented and so on.
        if(count==0){
            notifyAll();   // Once the student is done with reading he notifies the other students.
        }
        return x;   // returning the x we co
    }

}

class Teacher extends Thread{
    Teacher(Whiteboard w){
        this.w=w;
    }
    Whiteboard w;

    public void run(){
        int count=1;
        while(true){
            w.write(count);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } // delays the thread so the other thread could try to enter
            System.out.println("Teacher wrote: "+count);
            count++;
        }
    }
}

class Student extends Thread{
    String sname;
    Student(Whiteboard w, String name){
        this.w=w;
        this.sname=name;
    }
    Whiteboard w;

    public void run(){
        int value=0;
        while(true){
            value=w.read();
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } // delays the thread so the other thread could try to enter
            System.out.println(sname+" consumed "+value);
        }
    }
}

public class ClassroomChallenge {
    public static void main(String[] args) {
        Whiteboard w = new Whiteboard();
        Teacher t= new Teacher(w);
        Student s1 = new Student(w, "S1");
        Student s2 = new Student(w, "S2");
        Student s3 = new Student(w, "S3");
        t.start();
        s1.start();
        s2.start();
        s3.start();
    }
}
