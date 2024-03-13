class Rectangle{
    private int length; // we declare this as private to achieve data hiding
    private int breadth; // If we declare these as private, how are going to access these variables?

    public void setlength(int l){
        if(l>0) {
            length = l; // We can set conditions like these while we set the data.
        }  // By using these setter methods we can set values to the private data members.
    }


     public void setbreadth(int b){ // As a notion these better be declared as public.
        breadth=b;
    }

    int getLength()
    {
        return length;  // we can access these private data members using getter methods.
    }

    int getBreadth(){
        return breadth;
    }
}

public class DataHiding {

    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();

        r1.setlength(10);
        r1.setbreadth(5);

        r2.setlength(20);
        r2.setbreadth(10);

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());

        System.out.println(r2.getLength());
        System.out.println(r2.getBreadth());
    }


}
