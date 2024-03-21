package fileoperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FWTask4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTER THE TEXT
        System.out.print("Enter your message: ");
        String userMsg = sc.nextLine();

        // ENCRYPT MESSAGE
        String em = encrypt(userMsg);

        // WRITING THE ENCRYPTED TEXT TO A FILE WRITER
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\\\Users\\\\AASLIN-06\\encrypted.txt"));
            writer.write(em);
            writer.close();

            // READING THE ENCRYPTED TEXT FROM FILE
            BufferedReader reader = new BufferedReader(new FileReader("C:\\\\Users\\\\AASLIN-06\\encrypted.txt"));
            String encryptedMsgFromFile = reader.readLine();
            reader.close();

            // DECRYPT MESSAGE
            String dm = decrypt(encryptedMsgFromFile);

            // PRINT DECRYPTED MESSAGE
            System.out.println("DECRYPYTED MESSAGE" + dm);

            System.out.println("MESSAGE ENCRYPTED TO THE FILE ENCRYPTED TEXT");

        } catch (IOException io) {
            System.out.println("ERROR" + io.getMessage());
        }
    }

    // METHOD TO ENCRYPT MESSAGE USING SSCIPHER
    public static String encrypt(String msg) {
        int k = msg.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            char currentChar = msg.charAt(i);
            // KEY VALUE AS 3 IT SHIFTS TO 3 POSITIONS
            char encrptval = (char) (currentChar + 3);
            sb.append(encrptval);
            // System.out.println(encrptval);
        }
        return sb.toString();
    }

    // METHOD TO DECRYPT MESSAGE USING SSCIPHER
    public static String decrypt(String msg) {
        int k = msg.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            char currentChar = msg.charAt(i);
            // KEY VALUE AS 3 IT SHIFTS TO 3 POSITIONS
            char decryptval = (char) (currentChar - 3);
            sb.append(decryptval);
             System.out.println("THE DECRYPTED VALUE IS : " + decryptval);
        }

        return sb.toString();
    }
}
