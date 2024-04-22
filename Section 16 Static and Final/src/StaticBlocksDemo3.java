public class StaticBlocksDemo3 {

    static{
        System.out.println("Static Block 1");
    }

    public static void main(String[] args) {
        // Just by running this class without any contents in main function will print both static blocks

        System.out.println("main"); // Both the static blocks are printed first and then main is printed.
    }

    static{
        System.out.println("Static Block 2");
    }
}
