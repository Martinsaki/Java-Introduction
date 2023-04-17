public class SwitchStatement {
    public static void main(String[] args) {
        // Structure: switch(a){case value1: break; case value2: break; default: break;}
        // This case is useful when the number of cases is known
        String mode = "Red";
        switch (mode){
            case "Light":
                System.out.println("Mode: Light");
                break;
            case "Black":
                System.out.println("Mode: Black");
                break;
            default:
                System.out.println("Mode: Blue");
                break;
        }
    }
}
