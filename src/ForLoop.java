public class ForLoop {
    public static void main(String[] args) {
        // Structure: for (init; condition; increment) {instruction}
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            switch (i) {
                case 5:
                    for (int j = 0; j < 5; j++) {
                        System.out.println("Result: " + String.valueOf(j));
                        if (j == 2) {
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("Hi! I'm 7!");
                    continue;
            }
        }
    }
}
