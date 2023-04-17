public class Arrays {
    public static void main(String[] args) {
        // Structure:
        // Declaration: DataType[] name;
        // Definition: name = new DataType[capacity];
        String[] androidVersions = new String[17];

        String[][] cities = new String[4][2]; // For 8 elements
        // Array position = n-1

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Pie";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        System.out.println(androidVersions[1]);

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[2][1] = "Buenos Aires";
        System.out.println(cities[2][1]);
    }
}
