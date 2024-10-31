import java.util.scanner;

public class textEncryptionDecryption {

    private static void textEncryptionMenu(Scanner input) {
        int shiftvalue;
        int selection;
        String newstr;

            System.out.println("[1] Encryption,\n[2] Decryption,\n[3] Return to the Main Menu.");
            selection = input.nextInt();
            input.nextLine(); /* advance the scanner to the next line */
            newstr = "";

            switch (selection) {
                case 1:
                    System.out.println("Enter an integer shift value within the range of [-26] and [26] for encryption:");
                    shiftvalue = input.nextInt();
                    input.nextLine();
                    if (shiftvalue >= -26 && shiftvalue <= 26) {
                        System.out.print("Enter a string: ");
                        String str = input.nextLine();
                        for (int i = 0; i < str.length(); i++) {
                            char character = str.charAt(i);
                            int ascii = (int) character;
                            if (ascii >= 65 && ascii <= 90) {
                                ascii = ascii + shiftvalue;
                                if (ascii > 90) {
                                    ascii = ascii - 26;
                                }
                                newstr += (char) ascii;
                            } else if (ascii >= 97 && ascii <= 122) {
                                ascii = ascii + shiftvalue;
                                if (ascii > 122) {
                                    ascii = ascii - 26;
                                }
                                newstr += (char) ascii;
                            } else {
                                newstr += (char) ascii;
                            }
                        }
                        System.out.println("Encrypted message: " + newstr);
                    } else {
                        System.out.println("Outside the range.");
                    }
                    break;
                case 2:
                    System.out.println("Enter an integer shift value within the range of [-26] and [26] for decryption:");
                    shiftvalue = input.nextInt();
                    input.nextLine();
                    if (shiftvalue >= -26 && shiftvalue <= 26) {
                        System.out.print("Enter a string: ");
                        String str = input.nextLine();
                        for (int i = 0; i < str.length(); i++) {
                            char character = str.charAt(i);
                            int ascii = (int) character;
                            if (ascii >= 65 && ascii <= 90) {
                                ascii = ascii - shiftvalue;
                                if (ascii < 65) {
                                    ascii = ascii + 26;
                                }
                                newstr += (char) ascii;
                            } else if (ascii >= 97 && ascii <= 122) {
                                ascii = ascii - shiftvalue;
                                if (ascii < 97) {
                                    ascii = ascii + 26;
                                }
                                newstr += (char) ascii;
                            } else {
                                newstr += (char) ascii;
                            }
                        }
                        System.out.println("Decrypted message: " + newstr);
                    } else {
                        System.out.println("Outside the range.");
                    }
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid command.");
            }
    }
}