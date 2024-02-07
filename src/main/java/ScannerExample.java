import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        greet();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the name:");
            String name = scanner.nextLine();
            System.out.println("Enter the age:");
            while (true) {
                if (scanner.hasNextInt()) {
                    String line = scanner.nextLine();
                    int age = Integer.parseInt(line);
                    break;
                } else {
                    System.out.println("Please enter the number");
                    scanner.nextLine();
                }
            }
        }
//        3235235235\nMasha
//        scanner.close();
    }

    public static void greet(){
        System.out.println("Hello World!");
    }

    public static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }

}
