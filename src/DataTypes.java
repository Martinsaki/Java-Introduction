public class DataTypes {
    public static void main(String[] args) {
        // We have different types of data: String, Integer, Boolean, Floats
        // Limit integer:
        int n = 1234567890; // Min -2147483648. Max 2147483647
        byte m = 127; // Min -128. Max 127
        short o = -32768; // Min -32768. Max 32767
        long l = 190000000000L; // Min -9223372036854775808. Max 9223372036854775807
        // Limit Float:
        float p = 19.40234F; // Min 1.40e-45. Max 3.40e+38
        double k = 25.57657; //Min 4.94-324. Max 1.79e+308
        // Strings
        char b = 'J'; // This accepts a single value type
        String j = "Martin";
        // Logics
        boolean trueOrFalse = true; // This accepts true or false
        // General value VAR
        var element = "Type definition"; // String, Boolean, Integer or Float
    }
}
