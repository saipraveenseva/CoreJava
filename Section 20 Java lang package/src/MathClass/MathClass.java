package MathClass;
public class MathClass {
    public static void main(String[] args) {
        // Absolute value
        int absInt = Math.abs(-10);
        double absDouble = Math.abs(-10.5);
        System.out.println("Absolute value of -10: " + absInt);
        System.out.println("Absolute value of -10.5: " + absDouble);

        // Trigonometric functions
        double radians = Math.toRadians(45); // Convert degrees to radians
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        System.out.println("Sin(45 degrees): " + sinValue);
        System.out.println("Cos(45 degrees): " + cosValue);
        System.out.println("Tan(45 degrees): " + tanValue);

        // Exponential and logarithmic functions
        double expValue = Math.exp(2); // e^2
        double logValue = Math.log(10); // Natural logarithm of 10
        double log10Value = Math.log10(10); // Base 10 logarithm of 10
        System.out.println("e^2: " + expValue);
        System.out.println("Natural log of 10: " + logValue);
        System.out.println("Log base 10 of 10: " + log10Value);

        // Power and square root
        double powerValue = Math.pow(2, 3); // 2^3
        double sqrtValue = Math.sqrt(16); // Square root of 16
        System.out.println("2^3: " + powerValue);
        System.out.println("Square root of 16: " + sqrtValue);

        // Rounding functions
        double roundValue = Math.round(10.6); // Rounds to nearest integer
        double ceilValue = Math.ceil(10.1); // Rounds up
        double floorValue = Math.floor(10.9); // Rounds down
        System.out.println("Rounded value of 10.6: " + roundValue);
        System.out.println("Ceil value of 10.1: " + ceilValue);
        System.out.println("Floor value of 10.9: " + floorValue);

        // Random number
        double randomValue = Math.random(); // Generates a random number between 0.0 and 1.0
        System.out.println("Random value: " + randomValue);

        // Min and Max
        int minValue = Math.min(5, 10);
        int maxValue = Math.max(5, 10);
        System.out.println("Min value between 5 and 10: " + minValue);
        System.out.println("Max value between 5 and 10: " + maxValue);

        // Cube root
        double cubeRootValue = Math.cbrt(27);
        System.out.println("Cube root of 27: " + cubeRootValue);

        // Exact decrement
        int exactDecrementValue = Math.decrementExact(10);
        System.out.println("Exact decrement of 10: " + exactDecrementValue);

        // Exponent (Euler's number e raised to the power of a double value)
        double expValue2 = Math.exp(2);
        System.out.println("e^2: " + expValue2);

        // Convert degrees to radians
        double radiansValue = Math.toRadians(45);
        System.out.println("45 degrees in radians: " + radiansValue);

        // Floor division
        int floorDivValue = Math.floorDiv(10, 3);
        System.out.println("Floor division of 10 by 3: " + floorDivValue);

        // StrictMath methods
        double strictExpValue = StrictMath.exp(2);
        System.out.println("StrictMath e^2: " + strictExpValue);

        double strictSinValue = StrictMath.sin(Math.toRadians(45));
        System.out.println("StrictMath sin(45 degrees): " + strictSinValue);

        // Max of two values
        int maxValue2 = Math.max(10, 20);
        System.out.println("Max value between 10 and 20: " + maxValue2);

        // Multiply exact
        int multiplyExactValue = Math.multiplyExact(10, 20);
        System.out.println("Multiply exact 10 and 20: " + multiplyExactValue);

        // Next after
        double nextAfterValue = Math.nextAfter(1.0, 2.0);
        System.out.println("Next after 1.0 towards 2.0: " + nextAfterValue);
    }
}
