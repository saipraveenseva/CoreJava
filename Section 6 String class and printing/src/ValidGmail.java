import java.util.Scanner;

public class ValidGmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        if(str.contains("@gmail.com")){
            System.out.println("Valid gmail.");

            int index=str.indexOf("@");

            System.out.println("User name: "+str.substring(0,index));
            System.out.println("Domain: "+str.substring(index+1));
        }

        else{
            System.out.println("Invalid gmail.");
        }



    }
}
