public class FormattedOutput {

    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("Sum: "+x+y); // Here both the + are considered as concatenation
        System.out.println(x+y+"Sum");   // Here one is considered as addition and other is concat.
        System.out.println("Sum of " +x+ " and " +y+ " is " +(x+y));
    }
}
