public class variables {
    /* Variables are spaces in memory, and are assigned a content.
    Variables in Java are made up of a name and a value. */
    public static void main(String[] args) {
        // Variable declaration
        int speed;
        // Variable assignment
        speed = 10;
        // Variable initialization
        System.out.println(speed);
        // Declaration, assignment and initialization
        int salary = 1000;
        String employeeName = "Martin";
        System.out.println(employeeName + salary);
        // Variable reassignment
        int count = 10;
        count = 20;
        System.out.println(count);
        count = 30;
        System.out.println(count);
        /* variables reserve space in memory, so calling the variable again saves the previous value */
    }
}
