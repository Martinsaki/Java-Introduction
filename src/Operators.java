public class Operators {
    public static void main(String[] args) {
        // Assignment operators: +, -, *, /, %
        int add = 89 + 234;
        System.out.println(add);
        int sub = 34 - 234;
        System.out.println(sub);
        int mul = 67 * 90;
        System.out.println(mul);
        int div = 45 / 5;
        System.out.println(div);
        int mod = 324 % 45;
        System.out.println(mod);
        // Increment and Decrement
        int i = 23;
        i++;
        i--;
        System.out.println(i);
        // Suffix and Postfix
        int gift = 100 + i++; // In this case, the result is 123 because the system first access the variable data and then increments that
        System.out.println(gift);
        int giftTwo = 100 + ++i; // In this case it first increments and then accesses the variable
        System.out.println(giftTwo);
    }
}
