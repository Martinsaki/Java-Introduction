public class JavaDocs {
    public static void main(String[] args) {
        System.out.println(convert(10000, "MXN"));
    }
    // When we type the function in main and position the mouse over it, we can see its usefulness
    /**
     * Description:
     * Convert an amount of money.
     * @param quantity Amount of money.
     * @param currency Money type: MXN or COL.
     * @return "quantity" Return an updated amount of money to dollar.
     * */
    public static double convert(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COL":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
