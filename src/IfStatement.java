public class IfStatement {
    public static void main(String[] args) {
        // Structure: if (condition) {instruction} else {instruction}
        int value = (int) (Math.floor(Math.random()*(5-20+1)+20));
        System.out.println(value);
        int conditionValue = 10;
        if (value <= 10) {
            System.out.println(++conditionValue);
            System.out.printf("The result is %d!",value);
        } else if (value == 20) {
            System.out.println(2 * conditionValue);
            System.out.println("The result is double?");
        } else {
            System.out.println(--conditionValue);
            System.out.println("Sorry, your number is too big");
        }
    }
}