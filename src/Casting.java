public class Casting {
    public static void main(String[] args) {
        // To realize the Casting, we must place between parentheses () the value to witch we want to convert the variable
        double elements = 30.0/12.0;
        System.out.println(elements);
        // Convert double to int
        int estimation = (int) elements; // Casting
        System.out.println(estimation);
        // Convert int to double
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);
    }
}
