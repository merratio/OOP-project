package groupWork;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Authenticater {

    public void addUser(String id, String password) {
        // Define the file name
        String fileName = "users.txt";

        try {

            FileWriter fileWriter = new FileWriter(fileName, true);

            // Append the user ID and password to the file, separated by a delimiter
            fileWriter.write(password + " ");
            fileWriter.write(id + "\n");

            fileWriter.close();

            System.out.println("User added successfully!");

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public int Authenticate() {

        int level = 0;

        HashMap<String, String> map = creatMap();
        System.out.println(map.get("honors29") + " " + map.get("runner29"));
        /*
         * Scanner scanner = new Scanner(System.in);
         * String username;
         * String password;
         * System.out.
         * println("Enter username.For non-admins, your username is your id/trn: ");
         * username = scanner.nextLine();
         * System.out.println("Enter password: ");
         * password = scanner.nextLine();
         * 
         * 
         * String value = map.get(password);
         * if (value != null && value.equals(username)) {
         * level = username.equals("admin") ? 2 : 1;
         * } else {
         * System.out.println("Email and password not valid");
         * level = 0;
         * }
         * 
         * scanner.close();
         */
        return level;
    }

    private static HashMap<String, String> creatMap() {
        HashMap<String, String> userMap = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File("users.txt"));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                userMap.put(parts[0], parts[1]);
                // System.out.println(parts[0] + " " + parts[1]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return userMap;
    }

}
