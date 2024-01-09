package Caesar_Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Caesar Cipher Menu:");
            System.out.println("1. Encode");
            System.out.println("2. Decode");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the string to encode: ");
                    String encodeStr = scanner.nextLine();
                    System.out.print("Enter the shift key: ");
                    int encodeKey = scanner.nextInt();
                    scanner.nextLine(); 
                    String encoded = Cipher.encode(encodeStr, encodeKey);
                    System.out.println("Encoded string: " + encoded);
                    break;
                    
                case 2:
                    System.out.print("Enter the string to decode: ");
                    String decodeStr = scanner.nextLine();
                    System.out.print("Enter the shift key: ");
                    int decodeKey = scanner.nextInt();
                    scanner.nextLine();
                    String decoded = Cipher.decode(decodeStr, decodeKey);
                    System.out.println("Decoded string: " + decoded);
                    break;
                    
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }
}
