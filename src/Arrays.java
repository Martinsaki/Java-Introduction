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

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[2][1] = "Buenos Aires";

        // Nested For

        for (int i = 0; i <= androidVersions.length-1; i++) {
            System.out.println(i + androidVersions[i]);
        }

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(i + cities[i][j]);
            }
        }
    }
}
