public class Functions {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        // Structure: public type name(parameters) {return values;}
        int valueAdded = add(a,b);
        System.out.println(valueAdded);
        System.out.println("COL to USD $" + convert(1000, "COL"));
    }
    // Functions live outside of main
    public static int add(int element1,int element2){
        return element1+element2;
        // If function doesn't return a value, we use void instead static
    }
    public static double convert(double quantity, String currency){
        switch (currency){
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
